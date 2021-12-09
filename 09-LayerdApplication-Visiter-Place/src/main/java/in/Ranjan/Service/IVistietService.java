package in.Ranjan.Service;

import java.util.List;

import in.Ranjan.Modle.Visiter;

public interface IVistietService {

	public List<Visiter> FetchVisiterDataToDist(String dist1, String dist2, String dist3) throws Exception;

}
