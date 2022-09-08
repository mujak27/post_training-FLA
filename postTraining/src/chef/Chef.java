package chef;

import worker.Worker;

public class Chef extends Worker {
	
	int skill;
	
	ChefState state;

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public ChefState getState() {
		return state;
	}

	public void setState(ChefState state) {
		this.state = state;
	}

	public Chef(String name, int speed, int skill) {
		super(name, speed);
		state = new State1Idle(this);
		this.skill = skill;
	}
	public Chef(String name, int speed) {
		super(name, speed);
		state = new State1Idle(this);
	}
	
	@Override
	public void start() {
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		state.activity();
		if(thread.isAlive()) run();
	}


}
