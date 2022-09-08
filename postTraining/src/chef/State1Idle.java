package chef;

public class State1Idle extends ChefState{

	public State1Idle(Chef chef) {
		super(chef);
	}

	@Override
	public void activity() {
		try {
		      synchronized(chef.thread) {
		    	  chef.thread.wait();
		        }
		} catch (InterruptedException e1) {
			return;
		}
	}

	@Override
	public void changeState() {
		chef.state = new State2Cook(chef);
		chef.thread.interrupt();
		
	}

}
