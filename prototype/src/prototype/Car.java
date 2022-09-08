package prototype;

public class Car implements Cloneable{
	
	int tire;
	
	public Car(int tire) {
		super();
		this.tire = tire;
	}
	
	public Car(Car c) {
		super();
		this.tire = c.tire;
	}
	
	@Override
	protected Car clone() {
		return new Car(this);
	}

}
