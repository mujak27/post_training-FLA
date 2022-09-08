import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Vector<String> data = new Vector<>();
		
		data.add("tegar");
		data.add("anthony");
		
		FIFOIterator fi = new FIFOIterator(data);
		
		while(fi.hasNext()) {
			System.out.println(fi.getNext());
		}
	}
}
