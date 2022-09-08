package proxy;

import java.util.Vector;

public class Internet {
	Vector<String> sites;
	
	public Internet() {
		sites = new Vector<>();
		sites.add("youtube.com");
		sites.add("discord.com");
		sites.add("reddit.com");
	}
	
	public void browse(String url) {
		int idx = sites.indexOf(url);
		if(idx > -1) {
			System.out.println("");
		}
	}
	
}
