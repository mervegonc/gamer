package gamer.concrete;

import gamer.abstracts.GameService;
import gamer.entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" Added To The System");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" Has Been SuccessFully Updated on The System");
		
	}

	@Override
	public void save(Game game) {
		System.out.println(game.getGameName()+" Has Been SuccessFully Saved on The System");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" Has Been Permanently Deleted on The System");
		
	}

}
