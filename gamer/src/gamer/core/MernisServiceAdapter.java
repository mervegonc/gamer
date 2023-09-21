package gamer.core;

import gamer.abstracts.GamerCheckService;
import gamer.entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getDateOfBirth());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
