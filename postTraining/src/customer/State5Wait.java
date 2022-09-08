package customer;

public class State5Wait extends CustomerState {

	public State5Wait(Customer customer) {
		super(customer);
	}

	@Override
	public void changeState(String type) {
		customer.state = new State6Eat(customer);
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
		System.out.println(customer.name +  " 5 " + customer.tolerance);
	}
	
}
