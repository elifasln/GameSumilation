package business.abstracts;

import java.util.List;

import entities.concretes.Gamer;

public interface GamerService {
	void add(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);

	
	Gamer get(int id);
	List<Gamer> getAll();


}
