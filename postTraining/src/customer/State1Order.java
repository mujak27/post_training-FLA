package customer;

import java.lang.Thread.State;

import waiter.Waiter;

public class State1Order extends CustomerState {

	public State1Order(Customer customer) {
		super(customer);
	}

	@Override
	public void changeState(String type) {
		customer.state = new State2Order(customer);
		if(customer.thread.getState() == State.TIMED_WAITING) 
			customer.thread.interrupt();
	}

	@Override
	public void activity() {
		try {			
			customer.thread.sleep(2000);
		}catch (Exception e) {
			System.out.println("thread stopped");
			return;
		}
		customer.tolerance--;
		System.out.println(customer.name +  " 1 " + customer.tolerance);
		
	}
	
}
