package business.abstracts;

import java.util.List;

import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;
import entities.concretes.Sale;

public interface SaleService {
	void sale(Game game,Gamer gamer,Campaign campaign);
	void update(Sale sale);
	void delete(Sale sale);
	
	Sale get(int id);
	List<Sale> getAll();

}
