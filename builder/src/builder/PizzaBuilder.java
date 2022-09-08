package builder;

public class PizzaBuilder {
	// copy attribute of pizza

	Boolean hasMeat;
	Boolean hasPepperone;
	String size;
	
	public PizzaBuilder(String size) {
		this.size = size;
		this.hasMeat = false;
		this.hasPepperone = false;
	}
	
	public void addMeat() {
		this.hasMeat = true;
	}
	
	public void removeMeat() {
		this.hasMeat = false;
	}
	
	public Pizza build() {
		return new Pizza(size, hasMeat, hasPepperone);
	}
}
