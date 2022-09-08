package waiter;

import postTraining.Restaurant;

public class State4WaitCook extends WaiterState{

	public State4WaitCook(Waiter waiter) {
		super(waiter);
		
	}

	@Override
	public void activity() {
		try {
		      synchronized(waiter.thread) {
		    	  waiter.thread.wait();
		        }
		} catch (InterruptedException e1) {
			return;
		}
		
	}

	@Override
	public void changeState(String type) {
		waiter.state = new State1Idle(waiter);
		Restaurant.getInstance().availWaiter(waiter);
	}
	
	

}