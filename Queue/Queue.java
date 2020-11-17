class Queue {
	
	private int[] queue;
	private int sizeOfArray; 
	private int capacity;
	private int front; 
	private int rear; 
	
	
	public Queue(int capacity) { 
		this.capacity = capacity;
		queue = new int[capacity];
		
		sizeOfArray = 0; 
		front = 0; 
		rear = 0; 
	}
	
	public int size() {
		return sizeOfArray; 
	}
	
	public boolean isEmpty() {
		return size() == 0; 
	}
	
	public void dequeue() {
		if(!isEmpty())
		front = front % capacity;
		queue[front++] = 0; 
		--sizeOfArray;
	}
	
	public boolean isFull() {
		return size() == capacity; 
	}

	public void enqueue(int m) throws QueueFullException {
		if(isFull()) {
			throw new QueueFullException();
		}
		
		rear = rear % capacity;
		queue[rear++] = m;
	}
	
	public int peekFirst() {
		return queue[front];
	}
	
	public int peekLast() {
		return queue[rear-1];
	}

	public void printQueue() {
		for(int i = 0; i < capacity; i++) {
			System.out.println(queue[i]);
		}
	}
}
