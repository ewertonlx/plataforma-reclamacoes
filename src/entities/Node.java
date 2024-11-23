package src.entities;

public class Node {
    private Client client;
    private Node next;
    private Node prev;

    public Node(Client client) {
        this.client = client;
        this.next = null;
        this.prev = null;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
