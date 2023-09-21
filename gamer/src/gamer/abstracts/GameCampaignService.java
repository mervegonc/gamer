package gamer.abstracts;

import gamer.entities.GameCampaign;

public interface GameCampaignService {
	void add(GameCampaign gameCampaign);
	void update(GameCampaign gameCampaign);
	void save(GameCampaign gameCampaign);
	void delete(GameCampaign gameCampaign);
}
