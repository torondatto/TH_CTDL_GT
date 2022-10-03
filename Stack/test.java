package Stack;

public class test {
    public static void main(String[] args) {
        MyStack<Integer> newStack = new MyStack<Integer>();

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        System.out.println(newStack.getPeek());
        newStack.pop();
        newStack.print();
    } 
}
