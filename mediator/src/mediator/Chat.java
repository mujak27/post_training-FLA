package mediator;

import java.util.Vector;

public class Chat extends Mediator{
	Vector<User> users;
	
	public Chat() {
		users = new Vector<>();
	}

	@Override
	public void sendMessage(User sender, String msg) {
		System.out.println(sender.name + " sent: " + msg);
		for(User user : users) {
			if(user != sender) user.receiveMessage(msg);
		}
	}

	@Override
	public void addUser(User user) {
		users.add(user);
		
	}
}
