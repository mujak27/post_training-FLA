package customer;

import chat.Chat;
import chat.Mediator;
import chef.Chef;
import human.Human;
import postTraining.Restaurant;
import waiter.Waiter;

public class Customer extends Human implements Runnable {
	
	Thread thread;
	String name;
	int tolerance;
	CustomerState state;
	int cookingPoint;
	
	
	public int getCookingPoint() {
		return cookingPoint;
	}

	public void setCookingPoint(int cookingPoint) {
		this.cookingPoint = cookingPoint;
	}

	public Customer(String name, int tolerance) {
		this.name = name;
		this.tolerance = tolerance;
		state = new State1Order(this);
	}
	
	public void start() {
		thread = new Thread(this, name);
		thread.start();
		this.chat = new Chat();
		chat.init(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CustomerState getState() {
		return state;
	}

	public void setState(CustomerState state) {
		this.state = state;
	}

	public int  getTolerance() {
		return tolerance;
	}

	public void setTolerance(int  tolerance) {
		this.tolerance = tolerance;
	}

	@Override
	public void run() {
		System.out.println("");
		state.activity();
		
		if(tolerance <= 0) {
			Restaurant.getInstance().getScore(-300);
		}
		if(thread.isAlive()) run();
	}

}
