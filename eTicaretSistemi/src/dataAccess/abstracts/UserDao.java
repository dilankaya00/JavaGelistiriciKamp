package dataAccess.abstracts;



import entities.concretes.User;

public interface UserDao {
	public void save(User user);
	User listMail(String mail);
	User checkMailPassword(String mail,String password);
}
