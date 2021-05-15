package business.concretes;

import java.util.regex.Pattern;

import business.abstracts.UserVerificationService;
import core.RunRules;
import entities.concretes.User;

public class UserVerificationManager implements UserVerificationService {
	public static final Pattern mailRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	@Override
	public boolean checkMail(String mail) {
		
		return mailRegex.matcher(mail).find();
	}

	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length()>=2) {
			return true;
		}else
			return false;
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length()>=2) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkPassword(String password) {
		if(password.length()>=6) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkPerson(User user) {
		 boolean result = RunRules.run(
				 checkFirstName(user.getFirstName()),
				 checkLastName(user.getLastName()),
				 checkPassword(user.getPassword()),
				 checkMail(user.getMail())
				 );
				
		return result;
	}

	@Override
	public void sendMail(String mail) {
		System.out.println("Please click on the link sent to:  "+ mail);
		
	}

	@Override
	public void verification(User user) {
		user.setUserVerification(true);
		System.out.println(user.getMail()+ " Your e-mail address has been successfully verified and you can log in. ");
		
	}

	@Override
	public boolean checkMailPassword(String mail, String password) {
		if(mail !="" && password!="") {
			return true;
		}else {
			return false;
		}
	}

}
