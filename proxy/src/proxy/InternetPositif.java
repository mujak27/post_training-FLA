package proxy;

import java.util.Vector;

public class InternetPositif {

	public Vector<String> banned;
	public Internet i;
	
	public InternetPositif() {
		banned = new Vector<>();
		banned.add("reddit.com");
		i = new Internet();
	}
	
	public void protectedBrowse(String url) {
		if(banned.indexOf(url) > -1) System.out.println("sites blocked");
		else i.browse(url);
	}
	
	
}
