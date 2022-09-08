package worker;

import human.Human;

public abstract class Worker extends Human implements Runnable  {

	public Worker(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}
	
	public abstract void start();

	String name;
	int speed;
	public Thread thread;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
