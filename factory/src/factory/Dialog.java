package factory;

import factoryButton.Button;
import factoryButton.CuppertinoButton;
import factoryButton.MaterialButton;

public class Dialog {
	public String os; // should be private
	public Button btn;
	
	public Dialog(String os) {
		this.os = os;
	}
	
	public Button createButton() {
		if(os == "android") btn = new MaterialButton();
		else btn = new CuppertinoButton();
		return btn;
	}

}
