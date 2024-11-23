import src.entities.Client;
import src.entities.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        Client client1 = new Client("Alice", "alice@example.com", "12345678901", "111111111");
        client1.setCodigo(1);
        Client client2 = new Client("Bob", "bob@example.com", "98765432101", "222222222");
        client2.setCodigo(2);

        list.add(client1);
        list.add(client2);

        System.out.println("Clientes na lista:");
        list.listAll();

        list.remove(1);
        System.out.println("Após remover cliente com código 1:");
        list.listAll();
        Client found = list.search(2);
        if (found != null) {
            System.out.println("Cliente encontrado: " + found.getName());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}
