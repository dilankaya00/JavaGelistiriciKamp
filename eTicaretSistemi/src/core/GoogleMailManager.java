package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import entities.concretes.User;

public class GoogleMailManager {
	public boolean checkMailTrue(User user) {
		Pattern pattern = Pattern.compile("@gmail.com", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(user.getMail());
	    return matcher.find();
	}

}
