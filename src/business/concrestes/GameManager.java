package business.concrestes;


import java.util.List;

import business.abstracts.GameService;
import dataAccess.abstracts.GameDao;
import entities.concretes.Game;

public class GameManager implements GameService {

	private GameDao gamedao;
	public GameManager(GameDao gamedao) {
		this.gamedao=gamedao;
	

}
	@Override
	public void add(Game game) {
this.gamedao.add(game);		
	}
	@Override
	public void delete(Game game) {
this.gamedao.delete(game);		
	}
	@Override
	public void update(Game game) {
this.gamedao.delete(game);		
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
