package chef;

import waiter.Waiter;

public abstract class ChefState {

	Chef chef;
	
	public ChefState(Chef chef) {
		this.chef = chef;
	}

	public abstract void activity();
	
	public abstract void changeState();

}
