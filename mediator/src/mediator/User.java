package mediator;

public class User {
	String name;
	Mediator room;
	
	public void joinChat(Mediator room) {
		this.room = room;
		this.room.addUser(this);
	} 
	
	public void sendMessage(String msg) {
		this.room.sendMessage(this, msg);
	}
	
	public void receiveMessage(String msg) {
		System.out.println("received " + msg);
	}
	
}
