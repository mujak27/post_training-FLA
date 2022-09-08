import java.util.Vector;

public class FIFOIterator implements Iterator<String>{

	Vector<String> data;
	int curr;
	
	public FIFOIterator(Vector d) {
		this.data = d;
		this.curr = 0;
	}

	@Override
	public String getNext() {
		return data.get(curr++);
	}

	@Override
	public Boolean hasNext() {
		return this.curr < this.data.size();
	}
	
	
	
	
	
	
}
