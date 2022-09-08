package mediator;

public class Main {
	static public void main(String[] args) {
		User jum = new User("jum");
		
		Mediator c = new Chat();
		c.add(jum);
		
	}
}
