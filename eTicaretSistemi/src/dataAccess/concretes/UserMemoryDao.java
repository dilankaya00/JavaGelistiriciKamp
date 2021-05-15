package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserMemoryDao implements UserDao {
	ArrayList<User> users= new ArrayList<User>();
	@Override
	public void save(User user) {
		users.add(user);
		System.out.println(user.getFirstName()+" "+user.getLastName()+" user added.");
	}

	@Override
	public User listMail(String mail) {
		for(User user :users) {
			if(user.getMail()== mail) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User checkMailPassword(String mail, String password) {
		for(User user: users) {
			if(user.getMail()== mail && user.getPassword()== password) {
				return user;
			}
		}
		return null;
	}

}
