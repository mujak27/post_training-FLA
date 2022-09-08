package mediator;

public abstract class Mediator {
	public abstract void sendMessage(User user, String msg);
	public abstract void addUser(User user);
}
