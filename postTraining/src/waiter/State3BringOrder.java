package waiter;

public class State3BringOrder extends WaiterState{

	public State3BringOrder(Waiter waiter) {
		super(waiter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void activity() {
		try {			
			waiter.thread.sleep(1000);
		}catch (Exception e) {
			return;
		}
		waiter.chat.waitingChef();
		
	}

	@Override
	public void changeState(String type) {
		waiter.thread.interrupt();
		waiter.state = new State4WaitCook(waiter);
	}

}
