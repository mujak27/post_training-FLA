package state;

public class IdleState extends State{

	public IdleState(Chef c) {
		super(c);
		System.out.println(c.name + " is available");
	}
	
	public void changeState() {
		 c.state = new CookingState(c);
	}
}
