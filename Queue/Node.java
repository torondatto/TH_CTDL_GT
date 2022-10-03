package Queue;

public class Node <E> {
    private E element;
    protected Node<E> next;

    public Node(){
        element = null;
        next = null;
    }
    
    public Node(E data) {
        this(data, null);
    }

    public Node(E data, Node<E> next) {
        this.element = data;
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> curr) {
        this.next = curr;
    }
}
