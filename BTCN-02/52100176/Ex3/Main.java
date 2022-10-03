public class Main {
    public static String reverseString(String item) {
        MyStack<Character> newStack = new MyStack<Character>();
        char[] temp = item.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            newStack.push(temp[i]);
        }
        String newString = new String();
        while (!newStack.isEmpty()) {
            newString += newStack.pop();
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("pop"));
    }
}
