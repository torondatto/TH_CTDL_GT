public interface StackInterface<E> {
    public boolean isEmpty();
    
    public int size();
    
    public E peek();
    
    public E pop();

    public void push(E item);
    
    public void print();
}
