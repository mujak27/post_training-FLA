package observer2;

import java.util.Vector;

public class Shop {
	Vector<User> subs;
	
	public Shop() {
		subs = new Vector<>();
	}
	
	public void addUser(User user) {
		subs.add(user);
	}
	
	public void notifyUser(String product, String preference) {
		for(User user : subs) {
			if(preference == user.preference) user.notified(product);
		}
	}
	
	
}
