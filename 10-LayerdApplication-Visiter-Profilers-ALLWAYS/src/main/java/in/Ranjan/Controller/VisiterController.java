package in.Ranjan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.Ranjan.Modle.Visiter;
import in.Ranjan.Service.IVistietService;

@Controller
public class VisiterController {

	// Invoke The Service Class
	@Autowired
	private IVistietService service;

	public List<Visiter> ShowVisitPlaceByDistic(String dist1, String dist2, String dist3) throws Exception {
		// use the service class
		List<Visiter> vist = service.FetchVisiterDataToDist(dist1, dist2, dist3);
		return vist;
	}

}
