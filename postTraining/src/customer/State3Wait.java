package customer;

import chef.Chef;

public class State3Wait extends CustomerState {

	public State3Wait(Customer customer) {
		super(customer);
	}

	@Override
	public void changeState(String type) {
		customer.state = new State4Wait(customer);
		customer.thread.interrupt();
	}

	@Override
	public void activity() {
		try {			
			customer.thread.sleep(4000);
		}catch (Exception e) {
			return;
		}
		customer.tolerance--;
		System.out.println(customer.name +  " 3 " + customer.tolerance);
	}
	
}
