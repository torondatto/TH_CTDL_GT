public class test {
    public static void main(String[] args) {
        MyStack<Integer> newStack = new MyStack<Integer>();

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        newStack.print();

        System.out.println(newStack.getPeek());
        newStack.pop();
        newStack.print();

        MyQueue<Integer> newQueue = new MyQueue<Integer>();

        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.enQueue(4);
        newQueue.print();
    }
}
