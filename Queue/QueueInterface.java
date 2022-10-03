package Queue;

public interface QueueInterface<E> {
    public void enQueue(E item);
    public E deQueue() throws IllegalStateException;
    public int size();
    public boolean isEmpty();
    public boolean contains(E item);
    public void print();
    public E getFront();   
}
