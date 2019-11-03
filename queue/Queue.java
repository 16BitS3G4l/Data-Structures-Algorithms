class Queue {
	
	private int[] queue;
	private int capacity; 
	private int sizeOfArray; 
	private int front; 
	private int rear; 
	
	
	public Queue(int capacity) {
		this.capacity = capacity; 
		queue = new int[capacity];
		
		sizeOfArray = 0; 
		front = 0; 
		rear = 0; // should be the last element of the queue 
		
	}
	
	public int size() {
		return sizeOfArray; 
	}
	
	public boolean isEmpty() {
		return size() == 0; 
	}
	
	public void dequeue() {
		if(!isEmpty())
		++front;
	}
	
	public boolean isFull() {
		return size() == capacity; 
	}

	public void enqueue(int m) throws QueueFullException {
		if(isFull()) {
			throw new QueueFullException();
		}
		
		queue[rear] = m;
		++rear;
	}
	
	public int peekFirst() {
		return queue[front];
	}
	
}
