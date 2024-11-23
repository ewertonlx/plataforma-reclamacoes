package src.entities;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(Client client) {
        Node newNode = new Node(client);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }

    public void remove(int codigo) {
        Node current = head;
        while (current != null) {
            if (current.getClient().getCodigo() == codigo) {
                if (current.getPrev() != null) {
                    current.getPrev().setNext(current.getNext());
                } else {
                    head = current.getNext();
                }

                if (current.getNext() != null) {
                    current.getNext().setPrev(current.getPrev());
                } else {
                    tail = current.getPrev();
                }
                return;
            }
            current = current.getNext();
        }
    }

    public Client search(int codigo) {
        Node current = head;
        while (current != null) {
            if (current.getClient().getCodigo() == codigo) {
                return current.getClient();
            }
            current = current.getNext();
        }
        return null;
    }

    public void listAll() {
        Node current = head;
        while (current != null) {
            Client client = current.getClient();
            System.out.println("Código: " + client.getCodigo() +
                               ", Nome: " + client.getName() +
                               ", Email: " + client.getEmail() +
                               ", CPF: " + client.getCpf() +
                               ", Telefone: " + client.getPhone());
            current = current.getNext();
        }
    }
}
