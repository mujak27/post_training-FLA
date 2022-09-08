package worker;

import chef.Chef;
import postTraining.Restaurant;
import waiter.Waiter;

public class WorkerFactory {
	
	public static boolean validateName(String s) {
		if(s.length()!=2) return false;
		for(char c : s.toCharArray()) if(c<'A' || c>'Z') return false;
		for(Worker waiter : Restaurant.getInstance().waiters) {
			if(waiter.getName() == s) return false;
		}
		for(Worker chef: Restaurant.getInstance().chefs) {
			if(chef.getName() == s) return false;
		}
		return true;
	}
	
	Worker worker;
	
	public WorkerFactory createWorker(String type, String name, int speed) {
		if(type == "Waiter") {
			worker = new Waiter(name, speed);
		}else {
			worker = new Chef(name, speed);
		}
		return this;
	}

	public WorkerFactory addSkill(int skill) {
		((Chef)this.worker).setSkill(skill);
		return this;
	}
	
	public Worker Build() {
		worker.start();
		return worker;
	}
	
}
