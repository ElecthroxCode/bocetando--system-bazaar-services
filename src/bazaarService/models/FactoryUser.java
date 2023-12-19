package bazaarService.models;

import java.util.ArrayList;
import java.util.List;

public abstract class FactoryUser {
	protected List<User> users = new ArrayList<User>();
	protected User user;
	public abstract User createUser();
	public abstract void showUsers();
	void addUser() {
		users.add(user);
	}
	public List<User> getUsers() {
		return users;
	}
	
	
}
