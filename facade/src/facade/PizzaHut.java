package facade;

public class PizzaHut {
	public PizzaHut() {
		
	}
	
	private Pizza createDough(String size) {
		return new Pizza(size);
	}
	
	private Pizza addToppings(Pizza p) {
		return p.addMeat();
	}
	
	private void deliver(Pizza p, String address) {
		System.out.println("pizza is delivered to " + address);
	}
	
	private void order(Pizza p) {
		
	}
	
	
}
