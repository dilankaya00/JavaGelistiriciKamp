package business.concretes;

import business.abstracts.MailManagerService;
import business.abstracts.UserManagerService;
import business.abstracts.UserVerificationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserManagerService {
	UserDao userDao;
	UserVerificationService userVerificationService;
	MailManagerService mailManagerService;
	
	
	public UserManager(UserDao userDao, UserVerificationService userVerificationService) {
		super();
		this.userDao = userDao;
		this.userVerificationService = userVerificationService;
	}

	@Override
	public void add(User user) {
		
	}

	@Override
	public void login(String mail, String password) {
		// TODO Auto-generated method stub
		
	}

}
