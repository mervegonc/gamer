package gamer.entities;

public class GameCampaign {
	private int gameCampaignId;
	private String gameCampaignName;
	private int gameCampaignDiscount;
	public GameCampaign() {
		super();
	}
	public GameCampaign(int gameCampaignId, String gameCampaignName, int gameCampaignDiscount) {
		super();
		this.gameCampaignId = gameCampaignId;
		this.gameCampaignName = gameCampaignName;
		this.gameCampaignDiscount = gameCampaignDiscount;
	}
	public int getGameCampaignId() {
		return gameCampaignId;
	}
	public void setGameCampaignId(int gameCampaignId) {
		this.gameCampaignId = gameCampaignId;
	}
	public String getGameCampaignName() {
		return gameCampaignName;
	}
	public void setGameCampaignName(String gameCampaignName) {
		this.gameCampaignName = gameCampaignName;
	}
	public int getGameCampaignDiscount() {
		return gameCampaignDiscount;
	}
	public void setGameCampaignDiscount(int gameCampaignDiscount) {
		this.gameCampaignDiscount = gameCampaignDiscount;
	}
	
}
