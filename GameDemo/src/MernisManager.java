import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager implements CustomerCheckService {

	
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),
					customer.getFirstName(),customer.getLastName(),
					customer.getDateOfBirth().getYear());
			
		} catch (Exception e) {
			System.out.println("Not a valid person");
		}
		
		return false;
	}
}
