package Queue;

public class MyQueue<E> implements QueueInterface<E> {
    private Node<E> front = null;
    private Node<E> rear = null;
    private int numNode = 0;
 

    @Override
    public boolean contains(E item) {
        for(Node<E> n = front; n!= null; n = n.getNext()) {
            if(n.getElement().equals(item)) {
                return true;
            }   
        }
        return false;
    }

    @Override
    public E deQueue() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        E tmp = front.getElement();
        front= front.getNext();
        numNode--;
        if (front == null) {
            rear = null;
        }
        return tmp;
    }

    @Override
    public void enQueue(E item) {
        Node<E> newNode = new Node<E>(item);
        
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        numNode++;
    }

    @Override
    public E getFront() {
        return front.getElement();
    }

    @Override
    public boolean isEmpty() {
        if (numNode == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void print() {
        if (front != null) {
            Node<E> tmp = front;
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
    public int size() {
        return numNode;
    }
    
}
