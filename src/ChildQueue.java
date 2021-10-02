
public class ChildQueue {
	private int maxSize;
	private Child[] children;
	private int front;
	private int rear;
	private int nItems;
	
	
	/**
	 * Class constructor
	 * @param size
	 */
	public ChildQueue(int size) {
		this.maxSize = size;
		this.children = new Child[this.maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	
	/**
	 * Insert new child into the queue
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public void insert(String firstName, String lastName, int age) {
		if(this.rear == this.maxSize - 1) {
			this.rear = -1;
		}
		this.children[++this.rear] = new Child(firstName, lastName, age);
		this.nItems++;
	}
	
	
	/**
	 * Removing child from the queue
	 * @return Child
	 */
	public Child remove() {
		Child temp = this.children[this.front++];
		if(this.front == this.maxSize) {
			this.front = 0;
		}
		this.nItems--;
		return temp;
	}
	
	
	/**
	 * Checking if the queue is empty
	 * @return boolean
	 */
	public boolean isEmpty() {
		return this.nItems == 0;
	}
	
	
	/**
	 * Checking if the queue is full
	 * @return boolean
	 */
	public boolean isFull() {
		return this.nItems == this.maxSize;
	}
	
	
	/**
	 * Checking the queue size
	 * @return
	 */
	public int sise() {
		return this.nItems;
	}
	
	
	/**
	 * Displaying all the children in the queue
	 */
	public void displayQueue() {
		while(!this.isEmpty()) {
			Child child = this.remove();
			System.out.println("Full name: "+child.getFullName()+" Age: "+child.getAge());
		}
	}
}
