import java.util.*;

public interface StackInterface <E> {
    public void push(E item);

    public E pop() throws EmptyStackException;

    public int size();

    public boolean contains(E item);

    public boolean isEmpty();

    public void print();

    public E getPeek() throws EmptyStackException;
}