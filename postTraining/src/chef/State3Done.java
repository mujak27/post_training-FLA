package chef;

public class State3Done extends ChefState{

	public State3Done(Chef chef) {
		super(chef);
	}

	@Override
	public void activity() {
		changeState();
	}

	@Override
	public void changeState() {
		chef.state = new State1Idle(chef);
	}

}
