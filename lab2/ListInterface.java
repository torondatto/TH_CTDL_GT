import java.util.NoSuchElementException;
public interface ListInterface <E> {
    public void addFirst(E item);
    public void addAfter(Node <E> curr, E item);
    public void addLast(E item);

    public E removeFirst() throws NoSuchElementException;
    public E removeAfter(Node <E> curr) throws NoSuchElementException;
    public E removeLast() throws NoSuchElementException;
    public E removeCurr(Node<E> curr) throws NoSuchElementException;

    public void print();
    public boolean isEmpty();
    public E getFirst() throws NoSuchElementException;

    public boolean contains(E item);
    public int size();
    public Node<E> getHead();
}