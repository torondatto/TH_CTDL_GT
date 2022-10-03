import java.util.NoSuchElementException;

public class MyLinkedList<E> implements ListInterface<E> {
    private Node<E> head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    @Override
    public void addAfter(Node<E> curr, E item) {
        if (curr == null) {
            addFirst(item);
        } else {
            Node<E> newNode = new Node<E>(item, curr.getNext());
            curr.setNext(newNode);
        }
        numNodes++;
    }

    @Override
    public void addFirst(E item) {
        head = new Node<E>(item, head);
        numNodes++;
    }

    @Override
    public void addLast(E item) {
        if (head == null) {
            addFirst(item);
        } else {
            Node<E> tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            Node<E> newNode = new Node<E>(item, null);
            tmp.setNext(newNode);
            numNodes++;
        }

    }

    @Override
    public boolean contains(E item) {
        Node<E> tmp = head;
        while (tmp != null) {
            if (tmp.getElement().equals(item)) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    @Override
    public E getFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't get element from an emtpy list");
        } else {
            return head.getElement();
        }
    }

    @Override
    public Node<E> getHead() {
        return head;
    }

    @Override
    public boolean isEmpty() {
        if (numNodes == 0)
            return true;
        return false;
    }

    @Override
    public void print() {
        if (head != null) {
            Node<E> tmp = head;
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
    public E removeAfter(Node<E> curr) throws NoSuchElementException {
        if (curr == null) {
            throw new NoSuchElementException("Can't remove element from an emtpy list");
        } else {
            Node<E> delNode = curr.getNext();
            if (delNode != null) {
                curr.setNext(delNode.getNext());
                numNodes--;
                return delNode.getElement();
            } else {
                throw new IllegalStateException("No next node to remove");
            }
        }

    }

    @Override
    public E removeFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an emtpy list");
        } else {
            Node<E> tmp = head;
            head = head.getNext();
            numNodes--;
            return tmp.getElement();
        }

    }

    @Override
    public E removeLast() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an emtpy list");
        } else {
            Node<E> preNode = null;
            Node<E> delNode = head;
            while (delNode.getNext() != null) {
                preNode = delNode;
                delNode = delNode.getNext();
            }
            preNode.setNext(delNode.getNext());
            delNode.setNext(null);
            numNodes--;
            return delNode.getElement();
        }

    }

    @Override
    public int size() {
        return numNodes;
    }

    // Exercise 2
    @Override
    public E removeCurr(Node<E> curr) {
        if (curr == null) {
            System.out.println("Nothing to remove.");
        } else {
            Node<E> preNode = null;
            Node<E> delNode = head;
            while (delNode != null) {
                preNode = delNode;
                if (delNode.getElement() == curr.getElement()) {
                    preNode.setNext(delNode.getNext());
                    numNodes--;
                    return delNode.getElement();
                }
                delNode = delNode.getNext();
            }
        }
        return null;
    }
}
