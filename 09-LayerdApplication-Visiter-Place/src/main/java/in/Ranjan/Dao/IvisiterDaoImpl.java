package in.Ranjan.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.Ranjan.Modle.Visiter;

@Repository
public class IvisiterDaoImpl implements IvisiterDao {

	// Add The Ds Class As a Autowored
	@Autowired
	private DataSource ds;

	// Add The Query
	private static final String Queryvisiter = "SELECT VID,VNAME,VADDRES,VVISITPLACE,VMOB FROM VISITER WHERE VVISITPLACE IN (?,?,?) ORDER BY VVISITPLACE ";

	@Override
	public List<Visiter> GetVisiterVisiteState(String dist1, String dist2, String dist3) throws Exception {
		// Add The List Emp Data
		 List<Visiter> visitpeople = null;
		// Get Pooled Jdbc Connection
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(Queryvisiter);) {
			// Set Query In The Params
			ps.setString(1, dist1);
			ps.setString(2, dist2);
			ps.setString(3, dist3);
			// Execute The Query
			try (ResultSet rs = ps.executeQuery();) {
				visitpeople = new ArrayList();
				// Process The Resultset
				while (rs.next()) {
					// invoke The Visiter class object
					Visiter vis = new Visiter();
					vis.setVid(rs.getInt(1));
					vis.setVname(rs.getString(2));
					vis.setVaddres(rs.getString(3));
					vis.setVVisitPlace(rs.getString(4));
					vis.setVmob(rs.getLong(5));
					visitpeople.add(vis);
				    System.out.println(vis);
				}
			} catch (SQLException se) {
				se.printStackTrace();
				throw se;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return visitpeople;
	}

}
