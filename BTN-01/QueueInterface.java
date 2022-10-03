
public interface QueueInterface<E> {
    public void enQueue(E item);

    public E deQueue() throws IllegalStateException;

    public E getFront();

    public boolean isEmpty();

    public int size();

    public void print();

    public boolean contains(E item);
}
