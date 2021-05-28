package business.concrestes;

import java.util.List;

import business.abstracts.GamerService;
import dataAccess.abstracts.GamerDao;
import entities.concretes.Gamer;
public class GamerManager implements GamerService {
	
	
	private GamerDao gamerDao;
	public GamerManager(GamerDao gamerDao) {
		this.gamerDao=gamerDao;
	}


	@Override
	public void add(Gamer gamer) {
		this.gamerDao.add(gamer);
	}

	@Override
	public void update(Gamer gamer) {
this.gamerDao.update(gamer);		
	}

	@Override
	public void delete(Gamer gamer) {
this.gamerDao.delete(gamer);		
	}

	@Override
	public Gamer get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gamer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	}
	