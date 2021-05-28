package business.concrestes;

import java.util.List;

import business.abstracts.CampaignService;
import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;
import entities.concretes.Game;

public class CampaignManager implements CampaignService {
	
	CampaignDao campaignDao;
	
	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}
	@Override
	public void add(Campaign campaign) {
	     System.out.println("kampanya eklendi: "+campaign.getCampaignName());		
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Campaign get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Campaign> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getDiscount(Game game, Campaign campaign) {
		// TODO Auto-generated method stub
	return campaignDao.getDiscount(game, campaign);
	}

}
