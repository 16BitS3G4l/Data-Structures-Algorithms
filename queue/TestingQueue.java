public class TestingQueue {

    public static void main(String[] args) throws Exception {
        Queue q1 = new Queue(4);

        q1.enqueue(492);
        q1.enqueue(22);
        q1.enqueue(23);
        q1.enqueue(244);

        q1.dequeue();
        q1.dequeue();

        q1.enqueue(442);
        q1.dequeue();
        
        // there seems to be a weird bug when trying to do these....
        System.out.println(q1.peekFirst()); 
        System.out.println(q1.peekLast());

        System.out.println();
        System.out.println();
        System.out.println();

        q1.printQueue();
    }
} 