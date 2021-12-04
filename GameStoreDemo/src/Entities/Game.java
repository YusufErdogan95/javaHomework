package Entities;

public class Game {

	private int game›d;
	private	String gameName;
	private double gamePrice;
	
	
	
	//GameConstructor
	public Game(int game›d, String gameName, double gamePrice) {
		super();
		this.game›d = game›d;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}


	//Game GetterAndSetter
	public int getGame›d() {
		return game›d;
	}



	public void setGame›d(int game›d) {
		this.game›d = game›d;
	}



	public String getGameName() {
		return gameName;
	}



	public void setGameName(String gameName) {
		this.gameName = gameName;
	}



	public double getGamePrice() {
		return gamePrice;
	}



	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	
	
	
	
	
	
	
}
