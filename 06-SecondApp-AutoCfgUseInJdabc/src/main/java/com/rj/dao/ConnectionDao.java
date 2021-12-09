package com.rj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConnectionDao {

	// Craeet The Query
	private static final String Query = "SELECT COUNT(*) FROM EMP";

	// has-A Property
	@Autowired
	private DataSource ds;

	public int getCountData() throws Exception {
		System.out.println("ConnectionDao.getCountData()");
		// Craete The bConnectioin
		Connection con = ds.getConnection();
		// Create The Preapare Statement
		PreparedStatement ps = con.prepareStatement(Query);
		// Execute The Query
		ResultSet rs = ps.executeQuery();
		// Process The Resultset
		rs.next();
		int count = rs.getInt(1);
		// Close The Connection
		con.close();
		ps.close();
		rs.close();
		return count;
	}

}
