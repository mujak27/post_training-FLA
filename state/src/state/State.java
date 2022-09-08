package state;

public abstract class State {
	
	Chef c;
	
	public State(Chef c) {
		this.c = c;
	}
	
	public abstract void changeState();

}
