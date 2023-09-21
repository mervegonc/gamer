package gamer.abstracts;

import gamer.entities.Gamer;

public interface GamerService {
	void add(Gamer gamer);
	void update(Gamer gamer);
	void save(Gamer gamer);
	void delete(Gamer gamer);
	
}
