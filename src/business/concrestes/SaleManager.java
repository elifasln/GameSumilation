package business.concrestes;

import java.util.List;

import business.abstracts.SaleService;
import dataAccess.abstracts.SaleDao;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;
import entities.concretes.Sale;

public class SaleManager implements SaleService {
	SaleDao saleDao;
	public SaleManager(SaleDao saleDao) {
		this.saleDao=saleDao;
	}
	@Override
	public void sale(Game game, Gamer gamer, Campaign campaign) {
		Sale sale=new Sale(1,"001",gamer.getId(),game.getId());
		saleDao.add(sale, gamer, game);
	}
	@Override
	public void update(Sale sale) {
		saleDao.update(sale);
	}
	@Override
	public void delete(Sale sale) {
		saleDao.delete(sale);
		
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