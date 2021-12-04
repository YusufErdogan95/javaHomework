package Concrete;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("oyun eklendi:"+game.getGameName()+" " +game.getGamePrice());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("oyun gücellendi:"+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("oyun silindi:"+game.getGameName()+" " +game.getGameÝd());
		
	}

}
