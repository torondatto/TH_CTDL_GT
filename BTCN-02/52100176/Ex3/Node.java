public class Node<E> {
    private E element;
    private Node<E> next;

    public Node() {
        element = null;
        next = null;
    }

    public Node(E element) {
        this(element, null);
    }

    public Node(E element, Node<E> next) {
        this.element = element;
        this.next = next;
    }

    public E getElement() {
        return this.element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getNext() {
        return this.next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
