package in.Ranjan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Ranjan.Dao.IvisiterDao;
import in.Ranjan.Modle.Visiter;

@Service
public class IVistietServiceImpl implements IVistietService {

	// Invoke The Dao Class
	@Autowired
	private IvisiterDao dao;

	@Override
	public List<Visiter> FetchVisiterDataToDist(String dist1, String dist2, String dist3) throws Exception {
		// Use The Dao And Pass
		List<Visiter> visit = dao.GetVisiterVisiteState(dist1, dist2, dist3);
		return visit;
	}

}
