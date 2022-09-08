package observer2;

public class User {
	String name;
	String preference;
	
	public User(String name, String preference) {
		this.name = name;
		this.preference = preference;
	}
	
	public void notified(String product) {
		System.out.println(name + " notified " + product);
	}
}
