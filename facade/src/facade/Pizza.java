package facade;

public class Pizza {

	// copy attribute of pizza

	Boolean hasMeat;
	Boolean hasPepperone;
	String size;
	
	public Pizza(String size) {
		this.size = size;
		this.hasMeat = false;
		this.hasPepperone = false;
	}
	
	public Pizza addMeat() {
		this.hasMeat = true;
		return this;
	}
	
	public Pizza removeMeat() {
		this.hasMeat = false;
		return this;
	}
}
