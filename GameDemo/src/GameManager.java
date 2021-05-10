
public class GameManager implements GameManagerDao {
	
	

	@Override
	public void buyGame(Customer customer, Game game) {
		System.out.println(customer.getFirstName()+" bought the game named: "+ game.getGameName());
		
	}

	@Override
	public void restituteGame(Customer customer, Game game) {
		System.out.println(customer.getFirstName()+" restituted the game named: "+ game.getGameName());
		
	}

}
