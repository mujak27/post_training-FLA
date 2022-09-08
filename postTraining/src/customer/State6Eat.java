package customer;

import postTraining.Restaurant;

public class State6Eat extends CustomerState {

	public State6Eat(Customer customer) {
		super(customer);
	}

	@Override
	public void changeState(String type) {
//		System.out.println("end " + customer.getName());
		Restaurant.getInstance().getMoney(customer.getCookingPoint() * 30);
		Restaurant.getInstance().getScore(customer.getCookingPoint() * 30);
		Restaurant.getInstance().customerLeave(customer);
		customer.thread.stop();
	}
	@Override
	public void activity() {
		try {		
			customer.thread.sleep(6000);
		} catch (InterruptedException e1) {
			System.out.println("thread 6 stopped");
			return;
		}
		customer.chat.doneEating();
		
	}
	
}
