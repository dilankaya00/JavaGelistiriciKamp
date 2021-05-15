package business.abstracts;

import entities.concretes.User;

public interface UserVerificationService {
	boolean checkMail(String mail);
	boolean checkFirstName(String firstName);
	boolean checkLastName(String lastName);
	boolean checkPassword(String password);
	boolean checkPerson(User user);
	
	void sendMail(String mail);
	void verification(User user);
	boolean checkMailPassword(String mail,String password);
}
