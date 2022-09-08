package waiter;

import chef.Chef;
import customer.Customer;
import worker.Worker;

public class Waiter extends Worker {
	WaiterState state;
	
	public WaiterState getState() {
		return state;
	}

	public void setState(WaiterState state) {
		this.state = state;
	}

	public Waiter(String name, int speed) {
		super(name, speed);
		state = new State1Idle(this);
	}
	
	@Override
	public void start() {
		System.out.println("waiter started");
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println(getName() + " waiter run");
		state.activity();
//		if(thread.isAlive()) 
		run();
		
		
	}
	
}
