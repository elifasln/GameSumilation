import java.text.ParseException;
import java.text.SimpleDateFormat;


import Core.abstracts.GamerCheckService;

import Core.concretes.CheckGamerAdapter;
import business.abstracts.CampaignService;
import business.abstracts.GameService;
import business.abstracts.GamerService;
import business.abstracts.SaleService;
import business.concrestes.CampaignManager;
import business.concrestes.GameManager;
import business.concrestes.GamerManager;
import business.concrestes.SaleManager;
import dataAccess.concrestes.CampaignDaoManager;
import dataAccess.concrestes.GameDaoManager;
import dataAccess.concrestes.GamerDaoManager;
import dataAccess.concrestes.SaleDaoManager;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		 String pattern = "MM-dd-yyyy";
		  SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		
		Gamer gamer1=new Gamer(1,"12345678912","Elif","Aslan","elifaslan@gmail.com","1997");
		Gamer gamer2=new Gamer(2,"12345345912","Merve","Ataç","merveatac@gmail.com","1991");
		Gamer gamer3=new Gamer(3,"123345678912","Seda","Arý","sedaarý@gmail.com","1989");

		GamerService gamerService=new GamerManager(new GamerDaoManager());
		gamerService.add(gamer1);
		gamerService.delete(gamer2);
		gamerService.update(gamer3);

		
		GamerCheckService checkService=new CheckGamerAdapter();
		checkService.GamerCheck(gamer1);
		
		Game game1=new Game(1,"pubg",34.67);
		Game game2=new Game(2,"zula",12.56);
		GameService gameService=new GameManager(new GameDaoManager());
		gameService.add(game1);
		
		
		SaleService saleService=new SaleManager(new SaleDaoManager());
		saleService.sale(game2, gamer3, null);
		
		
		Campaign campaign1=new Campaign(1, "yüzde elli",simpleDateFormat.parse("10-03-1997"),simpleDateFormat.parse("12-04-2021"), 0);
		CampaignService campaignService=new CampaignManager(new CampaignDaoManager());
		campaignService.add(campaign1);	
}
}
