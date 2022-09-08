package waiter;

public abstract class WaiterState {

	Waiter waiter;
	
	public WaiterState(Waiter waiter) {
		this.waiter = waiter;
	}

	public abstract void activity();
	
	public abstract void changeState(String type);
}
