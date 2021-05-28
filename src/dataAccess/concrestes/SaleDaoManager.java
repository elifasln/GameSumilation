package dataAccess.concrestes;

import java.util.List;

import dataAccess.abstracts.SaleDao;
import entities.concretes.Game;
import entities.concretes.Gamer;
import entities.concretes.Sale;

public class SaleDaoManager implements SaleDao {

	@Override
	public void add(Sale sale, Gamer gamer, Game game) {
System.out.println("oyuncumuz: "+gamer.getFirstName()+" "+gamer.getLastName()+" "+"oyununuz: "+game.getGameName()+" "+"fatura numarasý: "+sale.getSaleNumber()+" "+"ile hesabýnýza eklendi");		
	}

	@Override
	public void update(Sale sale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Sale sale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Sale get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sale> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
