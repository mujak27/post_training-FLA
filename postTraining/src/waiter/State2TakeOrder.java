package waiter;

import customer.Customer;

public class State2TakeOrder extends WaiterState {

	public State2TakeOrder(Waiter waiter) {
		super(waiter);
	}
	
	@Override
	public void activity() {
		int waitingTime = (6-waiter.getSpeed());
		System.out.println("waiting for " + waitingTime);
		if(waitingTime < 0) waitingTime = 0;
		try {			
			waiter.thread.sleep(waitingTime*1000);
		}catch (Exception e) {
			return;
		}
		waiter.chat.bringToChef();
	}

	@Override
	public void changeState(String type) {
		waiter.state = new State3BringOrder(waiter);
	}

}
