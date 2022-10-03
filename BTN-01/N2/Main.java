
public class Main {
    public static void main(String[] args) {
        // Exercise 1
        MyLinkedList<Fraction> newListEx1 = new MyLinkedList<Fraction>();
        newListEx1.addFirst(new Fraction(1, 2));
        newListEx1.addFirst(new Fraction(2, 3));
        newListEx1.addLast(new Fraction(2, 4));
        newListEx1.addLast(new Fraction(1, 4));
        newListEx1.addLast(new Fraction(3, 4));
        newListEx1.print();
        System.out.println("Result of 2/3(FIRST) and (2/3)");
        System.out.print(newListEx1.getFirst().equals(new Fraction(2, 3)) + "\n");
        System.out.println("Result of 2/3(FIRST) and (1/5)");
        System.out.println(newListEx1.getFirst().equals(new Fraction(1, 5)));

        // Exercise 2
        MyLinkedList<Integer> newListEx2 = new MyLinkedList<Integer>();
        newListEx2.addFirst(5);
        newListEx2.addLast(9);
        newListEx2.addLast(10);
        newListEx2.addLast(3);
        newListEx2.addLast(2);
        newListEx2.print();

        // Exercise 3
        int temp = newListEx2.removeCurr(new Node<Integer>(9));
        System.out.println("Element just remove that : " + temp);

        // Exercise 4
        MyLinkedListInteger list = new MyLinkedListInteger();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(5);
        list.print();
        list.addBeforeFirstEvenNumber(8);
        list.print();
        list.reverse();
        list.print();
        list.sort();
        list.print();
    }
}
