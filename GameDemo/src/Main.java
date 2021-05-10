import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Customer customer1= new Customer(1,"Dilan", "Kaya","17450247672",new Date(1998,3,15));
		CustomerManager customerManager= new CustomerManager(new MernisManager());
		customerManager.add(customer1);
		
		Game game1 = new Game("Volarant", "fight game",70.99);
		GameManager gameManager= new GameManager();
		gameManager.buyGame(customer1, game1);
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.addCampaign(new Campaigns("Bayram indirimi",10.0));
		
		
	}

}
