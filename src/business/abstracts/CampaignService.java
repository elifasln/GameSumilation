package business.abstracts;

import java.util.List;

import entities.concretes.Campaign;
import entities.concretes.Game;

public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	Campaign get(int id);
	List<Campaign> getAll();
	double getDiscount(Game game, Campaign campaign);
	


}
