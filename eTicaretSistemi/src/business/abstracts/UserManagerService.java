package business.abstracts;

import entities.concretes.User;

public interface UserManagerService {
	public void add(User user);
	public void login(String mail, String password);

}
