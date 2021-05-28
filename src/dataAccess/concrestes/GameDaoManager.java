package dataAccess.concrestes;

import java.util.List;

import dataAccess.abstracts.GameDao;
import entities.concretes.Game;

public class GameDaoManager implements GameDao {
	public void add(Game game) {
		System.out.println("oyun eklendi: "+game.getGameName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("oyun silindi: "+game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("oyun güncellendi: "+game.getGameName());
		
	}

	@Override
	public Game getGame(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
