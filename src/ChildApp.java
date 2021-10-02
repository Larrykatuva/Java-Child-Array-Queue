
public class ChildApp {

	public static void main(String[] args) {
		ChildQueue queue = new ChildQueue(5);
		
		queue.insert("Ian", "Mumo", 3);
		queue.insert("Beti", "Mutinda", 8);
		queue.insert("Sheillah", "Ndanu", 5);
		queue.insert("Grace", "Ndanu", 7);
		
		queue.displayQueue();

	}

}
