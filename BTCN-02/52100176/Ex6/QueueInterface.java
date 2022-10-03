public interface QueueInterface<E> {
    public boolean isEmpty();
    public E getFront();
    public E deQueue();
    public void enQueue(E item);
}
