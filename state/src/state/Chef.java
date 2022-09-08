package state;

public class Chef {
	String name;
	State state;
	
	public Chef(String name) {
		this.name = name;
		this.state = new IdleState(this);
	}
}
