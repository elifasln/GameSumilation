package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Gamer;

public interface GamerDao {
	
	void add(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);

	
	Gamer get(int id);
	List<Gamer> getAll();

}
