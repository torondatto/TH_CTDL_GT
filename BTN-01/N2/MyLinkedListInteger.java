import java.util.NoSuchElementException;

public class MyLinkedListInteger {
    private NodeInteger head;
    private int numNode;

    public void addFirst(Integer item) {
        head = new NodeInteger(item, head);
        numNode++;
    }

    public int countEvenItem() {
        int num_item = 0;
        if (head == null)
            return num_item;
        NodeInteger temp = head;
        while (temp.getNext() != null) {
            if (temp.getData() % 2 == 0) {
                num_item++;
            }
        }
        return num_item;
    }

    private boolean isPrimeNumber(Integer num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimeNumbers() {
        int num = 0;
        if (head == null)
            return num;
        NodeInteger temp = head;
        while (temp.getNext() != null) {
            if (isPrimeNumber(temp.getData())) {
                num++;
            }
        }
        return num++;
    }

    public void addBeforeFirstEvenNumber(Integer item) {
        if (head != null) {
            NodeInteger temp = head;
            NodeInteger prev = null;
            while (temp.getNext() != null) {
                if (temp.getData() % 2 == 0) {
                    if (prev != null) {
                        prev.setNext(new NodeInteger(item, temp));
                    } else {
                        addFirst(item);
                    }
                    break;
                }
                prev = temp;
                temp = temp.getNext();
            }
        } // gia su head khong co thi add dau
        else {
            System.out.println("can not find item is even number");
        }
    }

    public NodeInteger maximum() {
        NodeInteger max = head;
        NodeInteger temp = head;
        while (temp.getNext() != null) {
            if (temp.getData().compareTo(max.getData()) > 0) {
                max = temp;
            }
        }
        return max;
    }

    public NodeInteger reverse() throws NoSuchElementException {
        if (head != null) {
            NodeInteger next = null, prev = null;
            NodeInteger curr = head;
            while (curr.getNext() != null) {
                next = curr.getNext();
                curr.setNext(prev);
                prev = curr;
                curr = next;
            }
            curr.setNext(prev);
            head = curr;
            return head;
        } else {
            throw new NoSuchElementException("can not reverse an empty node");
        }
    }

    public void sort() {
        if (head != null) {
            NodeInteger curr = head;
            NodeInteger index = null;
            while (curr != null) {
                index = curr.getNext();
                while (index != null) {
                    if (curr.getData().compareTo(index.getData()) > 0) {
                        Integer data = curr.getData();
                        curr.setData(index.getData());
                        index.setData(data);
                    }
                    index = index.getNext();
                }
                curr = curr.getNext();
            }
        } else {
            System.out.println("can not sort an empty list");
        }
    }

    public int size() {
        return numNode;
    }

    public boolean contains(Integer item) {
        NodeInteger tmp = head;
        while (tmp != null) {
            if (tmp.getData().equals(item)) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    public void print() {
        if (head != null) {
            NodeInteger tmp = head;
            System.out.print("List: " + tmp.getData());
            tmp = tmp.getNext();
            while (tmp != null) {
                System.out.print(" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
        } else {
            System.out.println("List is empty!");
        }
        System.out.println();
    }
}
