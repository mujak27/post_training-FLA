package customer;

public abstract class CustomerState {
	
	Customer customer;
	
	public CustomerState(Customer customer) {
		this.customer = customer;
	}

	public abstract void activity();
	
	public abstract void changeState(String type);
	
}
