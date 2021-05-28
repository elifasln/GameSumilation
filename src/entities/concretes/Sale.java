package entities.concretes;

import entities.abstracts.Entity;

public class Sale implements Entity {
	private int id;
	private String saleNumber;
	private int gamerId;
	private int gameId;
	public Sale(int id, String saleNumber, int gamerId, int gameId) {
		super();
		this.id = id;
		this.saleNumber = saleNumber;
		this.gamerId = gamerId;
		this.gameId = gameId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSaleNumber() {
		return saleNumber;
	}
	public void setSaleNumber(String saleNumber) {
		this.saleNumber = saleNumber;
	}
	public int getGamerId() {
		return gamerId;
	}
	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	
	

}
