package gamer.concrete;

import gamer.abstracts.GameCampaignService;
import gamer.entities.GameCampaign;

public class GameCampaignManager implements GameCampaignService{

	@Override
	public void add(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getGameCampaignName()+" Added To The System");
		
	}

	@Override
	public void update(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getGameCampaignName()+" Has Been SuccessFully Updated on The System");
		
	}

	@Override
	public void save(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getGameCampaignName()+" Has Been SuccessFully Saved on The System");
		
	}

	@Override
	public void delete(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getGameCampaignName()+" Has Been Permanently Deleted on The System");
		
	}

}
