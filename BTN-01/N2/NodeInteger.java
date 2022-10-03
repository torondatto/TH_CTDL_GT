public class NodeInteger {
    private Integer data;
    private NodeInteger next;

    public NodeInteger() {
        data = null;
        next = null;
    }

    public NodeInteger(Integer data) {
        this(data, null);
    }

    public NodeInteger(Integer data, NodeInteger next) {
        this.data = data;
        this.next = next;
    }

    public Integer getData() {
        return this.data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public NodeInteger getNext() {
        return next;
    }

    public void setNext(NodeInteger curr) {
        next = curr;
    }
}
