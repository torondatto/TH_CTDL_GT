public class MyStack<E> implements StackInterface<E> {
    private MyLinkedList<E> newStack;

    public MyStack() {
        newStack = new MyLinkedList<E>();
    }

    @Override
    public boolean isEmpty() {
        return newStack.isEmpty();
    }

    @Override
    public E peek() {
        if(isEmpty()) {
            return null;
        }
        return newStack.getFirst();
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        } else {
            E item = peek();
            newStack.removeFirst();
            return item;
        }
    }

    @Override
    public void print() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            newStack.print();
        }
    }

    @Override
    public void push(E item) {
        newStack.addFirst(item);
    }

    @Override
    public int size() {
        return newStack.size();
    }
    
}
