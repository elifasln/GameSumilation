package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Game;

public interface GameDao {
	void add(Game game);
	void delete(Game game);
	void update(Game game);
	
	Game getGame(int id);
	List<Game> getAll();

	

}
