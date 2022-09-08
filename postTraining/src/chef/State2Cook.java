package chef;

import postTraining.Restaurant;

public class State2Cook extends ChefState{

	public State2Cook(Chef chef) {
		super(chef);
	}

	@Override
	public void activity() {
		int waitingTime = (6-chef.getSpeed());
		if(waitingTime < 0) waitingTime = 0;
		System.out.println("cooking for " + waitingTime * 1000 + " second");
		try {			
			chef.thread.sleep(waitingTime * 1000);
		}catch (Exception e) {
			System.out.println("chef cook interrupted");
			return;
		}
		System.out.println("done waiting");
		chef.chat.doneCooking();
		
	}

	@Override
	public void changeState() {
		chef.state = new State3Done(chef);
		Restaurant.getInstance().availChef(chef);
	}
	
}
