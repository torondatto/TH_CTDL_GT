package Queue;

public class test {
    public static void main(String[] args) {
        MyQueue <Integer> newQueue = new MyQueue<Integer>();

        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.enQueue(4);
        newQueue.enQueue(5);
        newQueue.enQueue(6);

        newQueue.deQueue();
        newQueue.print();
        System.out.println(newQueue.getFront());
    }
}
