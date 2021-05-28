package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Gamer;
import entities.concretes.Game;

import entities.concretes.Sale;

public interface SaleDao {
	void add(Sale sale,Gamer gamer,Game game);
	void update(Sale sale);
	void delete(Sale sale);

	
	Sale get(int id);
	List<Sale> getAll();

}


