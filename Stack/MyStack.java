package Stack;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyStack <E> implements StackInterface<E> {
    private Node <E> top = null;
    private int numNode = 0;
    
    @Override
    public boolean contains(E item) {
        for (Node <E> n = top; n != null; n = n.getNext()) {
            if (n.getElement().equals(item)) return true;
        }
        return false;
    }
    @Override
    public E getPeek() throws EmptyStackException {
        try {
            return top.getElement();
        } catch (NoSuchElementException e) {
            throw new EmptyStackException();
        }
    }

    @Override
    public boolean isEmpty() {
        if (numNode == 0) return false;
        return true;
    }
    @Override
    public E pop() throws EmptyStackException {
        if (top == null) {
            throw new NoSuchElementException("The stack is empty.");
        } else {
            E item = top.getElement();
            top = top.getNext();
            numNode--;
            return item;
        }
    }
    @Override
    public void print() {
        if (top != null) {
            Node<E> tmp = top;
            System.out.print("List: " + tmp.getElement());
            tmp = tmp.getNext();
            while (tmp != null) {
                System.out.print(" -> " + tmp.getElement());
                tmp = tmp.getNext();
            }
            System.out.println();
        } else {
            System.out.println("List is emtpy!");
        }
    }
    @Override
    public void push(E item) {
        top = new Node<E> (item, top);
        numNode++;        
    }
    @Override
    public int size() {
        return numNode;
    }
}
