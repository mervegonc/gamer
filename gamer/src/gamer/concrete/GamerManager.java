package gamer.concrete;

import gamer.abstracts.GamerCheckService;
import gamer.abstracts.GamerService;
import gamer.entities.Gamer;

public class GamerManager implements GamerService{
	
    private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+" Added To The System");
		}else {
			System.out.println("Incorrect Value, Player Could Not Be Registered To The System.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Has Been SuccessFully Updated on The System");
		
	}

	@Override
	public void save(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Has Been SuccessFully Saved on The System");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" Has Been Permanently Deleted on The System");
		
	}

}


