import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyStack <E> implements StackInterface<E> {
    private Node<E> top;
    private int numNode;

    public MyStack() {
        top = null;
        numNode = 0;
    }

    @Override
    public boolean contains(E item) {
        for (Node<E> n = top; n != null; n = n.getNext()) {
            if (n.getData().equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E getPeek() throws EmptyStackException {
        try {
            return top.getData();
        } catch (NoSuchElementException e) {
            throw new EmptyStackException();
        }
    }

    @Override
    public boolean isEmpty() {
        if (numNode == 0) {
            return true;
        }
        return false;
    }

    @Override
    public E pop() throws EmptyStackException {
        if (top == null) {
            throw new NoSuchElementException("Stack is empty");
        } else {
            E item = top.getData();
            top = top.getNext();
            numNode--;
            return item;
        }
    }

    @Override
    public void print() {
        if (top != null) {
            Node<E> tmp = top;
            System.out.print("List: " + tmp.getData());
            tmp = tmp.getNext();
            while (tmp!= null) {
                System.out.print(" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        } else {
            System.out.println("List is empty!");
        }        
    }

    @Override
    public void push(E item) {
        top = new Node<E>(item, top);
        numNode++;
    }

    @Override
    public int size() {
        return numNode;
    }

}