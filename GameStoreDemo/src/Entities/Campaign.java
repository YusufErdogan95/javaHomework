package Entities;

public class Campaign {

	
	private int campaign›d;
	private String campaignName;
	private int discount;
	private int campaignDate;
	
	//Campain Constructor
	public Campaign(int campaign›d, String campaignName, int discount, int campaignDate) {
		super();
		this.campaign›d = campaign›d;
		this.campaignName = campaignName;
		this.discount = discount;
		this.campaignDate = campaignDate;
	}

  //campaign GetterandSetter
	public int getCampaign›d() {
		return campaign›d;
	}


	public void setCampaign›d(int campaign›d) {
		this.campaign›d = campaign›d;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public int getDiscount() {
		return discount;
	}


	public void setDiscount(int discount) {
		this.discount = discount;
	}


	public int getCampaignDate() {
		return campaignDate;
	}


	public void setCampaignDate(int campaignDate) {
		this.campaignDate = campaignDate;
	}
	
	
	
	
}
