package gamer;

import gamer.abstracts.*;
import gamer.concrete.*;
import gamer.concrete.GamerManager;
import gamer.core.MernisServiceAdapter;
import gamer.entities.*;
import gamer.entities.GameCampaign;
import gamer.entities.Gamer;

public class Main {
	Gamer gamer = new Gamer(1,"Merve","Göncü",2001,"12345678910");
	Game game = new Game(1,"CSGO",12);
	GameCampaign gameCampaign = new GameCampaign(1,"Special",50);

	GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
	gamerManager.add(gamer);
	
	GameManager gameManager = new GameManager();
	GameManager.add(game);
	
	GameCampaignManager campaignManager = new GameCampaignManager();
	GameCampaignManager.add(gameCampaign);
	
	SaleManager saleManager = new SaleManager();
	saleManager.sale(gamer,game);
	saleManager.saleWithCampaign(gamer,game,gameCampaign);
	
}
