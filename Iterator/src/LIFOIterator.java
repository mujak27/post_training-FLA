import java.util.Vector;

public class LIFOIterator implements Iterator<String>{
	

	Vector<String> data;
	int curr;
	
	public LIFOIterator(Vector d) {
		this.data = d;
		this.curr = d.size()-1;
	}

	@Override
	public String getNext() {
		return data.get(curr--);
	}

	@Override
	public Boolean hasNext() {
		return this.curr > 0 ;
	}
}
