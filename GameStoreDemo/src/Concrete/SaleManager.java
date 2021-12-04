package Concrete;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SaleManager {

	
	
		public void gameSales(User user, Game game, Campaign campaign) {
			double discountedPrice;
			discountedPrice = (game.getGamePrice() -(game.getGamePrice()	* campaign.getDiscount())/100);
			
			
			System.out.println(game.getGameName() + "indirimli =" +" "  +  discountedPrice);

	
		}
		
		
}

