import business.abstracts.UserVerificationService;
import business.concretes.UserManager;
import business.concretes.UserVerificationManager;
import core.GoogleMailAdapter;
import dataAccess.concretes.UserMemoryDao;
import entities.concretes.User;

public class Main {
	public  static void main(String[] args) {
		UserManagerService userManager= new UserManager(new UserMemoryDao(),new UserVerificationManager(),new GoogleMailAdapter());
		UserVerificationService userVerificationService= new  UserVerificationManager();
		User dilan= new User("Dilan","Kaya","dilankayaa16@gmail.com","123456");	
		User ali= new User("Ali","Bayraktar","aliibayraktar64@gmail.com","253648");
		
		userManager.add(dilan);
		userManager.add(ali);
		userVerificationService.verification(dilan);
		userVerificationService.verification(ali);
		userManager.login("dilankayaa16@gmail.com", "123456");
		userManager.login("aliibayraktar64@gmail.com", "253648");
		
		
	}
}
