package entities.concretes;

import java.util.Date;

public class Campaign {
	private int id;
	private String campaignName;
	private Date firsTime;
	private Date lastTime;
	private double discount;
	public Campaign(int id, String campaignName, Date firsTime, Date lastTime, double discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.firsTime = firsTime;
		this.lastTime = lastTime;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public Date getFirsTime() {
		return firsTime;
	}
	public void setFirsTime(Date firsTime) {
		this.firsTime = firsTime;
	}
	public Date getLastTime() {
		return lastTime;
	}
	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	

}
