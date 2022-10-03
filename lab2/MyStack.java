import java.util.*;

class MyStack <E> extends MyLinkedList <E> implements StackADT <E>{
	public boolean empty() { return isEmpty();	}

	public E peek() throws EmptyStackException {
		try {
			return getFirst();
		} catch (NoSuchElementException e) {
			throw new EmptyStackException();
		}
	}

	public E pop() throws EmptyStackException {
		E obj = peek();
		removeFirst();
		return obj;
	}

	public void push (E o) { addFirst(o); }
}