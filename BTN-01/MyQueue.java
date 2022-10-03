public class MyQueue<E> implements QueueInterface<E>{
    private Node<E> front;
    private Node<E> rear;
    private int numNode;

    public MyQueue() {
        front = null;
        rear = null;
        numNode = 0;
    }

    @Override
    public boolean contains(E item) {
        for (Node<E> n = front; n != null; n = n.getNext()) {
            if (n.getData().equals(item)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public E deQueue() throws IllegalStateException {
        if(isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        } 
        E item = front.getData();
        front = front.getNext();
        numNode--;
        if (front == null) {
            rear = null;
        }
        return item;
    }
    @Override
    public void enQueue(E item) {
        this.front = new Node<E>(item, front);
        numNode++;
    }
    @Override
    public E getFront() {
        return front.getData();
    }
    @Override
    public boolean isEmpty() {
        if (numNode == 0) { return true; }
        return false;
    }
    @Override
    public void print() {
        if (front != null) {
            Node<E> tmp = front;
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
    public int size() {
        return numNode;
    }
    
}
