package postTraining;

import customer.Customer;

public class Main {

	public static void main(String[] args) {
		Highscore.getInstance().readFile();
		Restaurant.getInstance().Start();
	}

}
