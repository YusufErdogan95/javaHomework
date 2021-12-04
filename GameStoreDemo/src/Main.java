import java.rmi.RemoteException;

import Adapters.MernisCheckService;
import Concrete.CampaingManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		User user =new User(1, "ysf", "erd", "123456789", 1995);
		
		Game game = new Game(1, "LOL", 1000);
		
		Campaign campaign = new Campaign( 1,"ocak indirimi", 10, 0); 
		
		
		
		UserManager userManager = new UserManager(new MernisCheckService());
		userManager.add(user);
		
		GameManager gameManager =new GameManager() ;
		gameManager.add(game);

		CampaingManager campaingManager =  new CampaingManager();
		campaingManager.add(campaign);
		
		SaleManager saleManager =new SaleManager ();
		saleManager.gameSales(user, game, campaign);
		
		
		
	}

}
