package postTraining;

import java.io.File;
import java.io.FileWriter;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Highscore {
	
	String highscoreString = "highscore.txt";

	static Highscore highscore;
	
	public static Highscore getInstance() {
		if(highscore == null) highscore = new Highscore();
		return highscore;
	}
	
	class User{
		String name;
		public User(String name, int score) {
			super();
			this.name = name;
			this.score = score;
		}
		int score;
	}
	class sortUserByScore implements Comparator<User>{
		@Override
		public int compare(User o1, User o2) {
			return o2.score - o1.score;
		}
		
	}
	
	Vector<String> result;
	
	void readFile(){
		result = new Vector<>();
		try {
			File file = new File(highscoreString);
			Scanner fileReader = new Scanner(file);
			while(fileReader.hasNextLine()) {
				result.add(fileReader.nextLine());
			}
			fileReader.close();
		}catch (Exception e) {
			
		}
		return;
	}
	
	public void printScore() {
		// name#score
		Vector<User> users = new Vector<>(); 
		for(String data : result) {
			String[] splitten = data.split("#");
			String name = splitten[0];
			int score = Integer.parseInt(splitten[1]);
			users.add(new User(name, score));
		}
		users.sort(new sortUserByScore());
	}
	
	public void writeScore(String name, int score) {
		try {
			FileWriter fileWriter = new FileWriter(highscoreString);
			String res = name + "#" + score + "\n";
			fileWriter.write(res);
			fileWriter.close();
		}catch (Exception e) {
			System.out.println("unable to save data....");
		}
	}

}
