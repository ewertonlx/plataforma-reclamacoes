package src.interfaces;
import src.entities.Client;
import java.util.ArrayList;

public interface IClient {
    // Métodos da interface IClient que devem ser implementados pela classe ClientRepository
    void addClient(Client client);
    void removeClient(Client client);
    void updateClient(Client client);
    Client getClient(String id);
    ArrayList<Client> getAllClients();
}
