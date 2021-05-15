package core;

import business.abstracts.MailManagerService;
import entities.concretes.User;

public class GoogleMailAdapter implements MailManagerService {

	@Override
	public boolean checkMailTrue(User user) {
		GoogleMailManager googleMailManager= new GoogleMailManager();
		return googleMailManager.checkMailTrue(user);
	}

}
