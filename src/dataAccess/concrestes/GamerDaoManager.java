package dataAccess.concrestes;

import java.util.List;

import dataAccess.abstracts.GamerDao;
import entities.concretes.Gamer;

public class GamerDaoManager implements GamerDao {

	@Override
	public void add(Gamer gamer) {
System.out.println("oyuncu eklendi: "+gamer.getFirstName()+" "+gamer.getLastName());		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("oyuncu bilgileri güncellendi: "+gamer.getFirstName()+" "+gamer.getLastName());		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("oyuncu silindi: "+gamer.getFirstName()+" "+gamer.getLastName());		
		
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
