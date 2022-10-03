public class MyQueue<E> implements QueueInterface<E> {

    private MyStack<E> input;
    private MyStack<E> output;

    public MyQueue() {
        input = new MyStack<E>();
        output = new MyStack<E>();
    }

    @Override
    public E deQueue() {
        if(isEmpty()) {
            return null;
        } else {
            while (!output.isEmpty()) {
                input.push(output.pop());
            }
            E item = input.pop();
            return item;
        }
    }

    @Override
    public void enQueue(E item) {
        while (!input.isEmpty()) {
            output.push(input.pop());
        }
        output.push(item);
    }

    @Override
    public boolean isEmpty() {
        return output.isEmpty();
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            return null;
        }
        while (!output.isEmpty()) {
            input.push(output.pop());
        }
        E result = input.peek();
        while(!input.isEmpty()) {
            output.push(input.pop());
        }
        return result;
    }

    public void print() {
        while (!output.isEmpty()) {
          input.push(output.pop());
        }
        while (!input.isEmpty()) {
          System.out.print(input.peek() + " ");
          output.push(input.pop());
        }
        System.out.println();
      }
}
