package customer;

public class State4Wait extends CustomerState {

	public State4Wait(Customer customer) {
		super(customer);
	}

	@Override
	public void changeState(String type) {
		customer.state = new State5Wait(customer);
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
		System.out.println(customer.name +  " 4 " + customer.tolerance);
	}
	
}
