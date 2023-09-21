package gamer.abstracts;

import gamer.entities.Game;
import gamer.entities.GameCampaign;
import gamer.entities.Gamer;

public interface SaleService {
	void sale(Gamer gamer,Game game);
	void saleWithCampaign(Gamer gamer, Game game, GameCampaign gameCampaign);
}
