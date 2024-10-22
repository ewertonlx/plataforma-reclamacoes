package src.interfaces;
import src.entities.Client;
import java.util.List;

public interface IClient {
    // Métodos da interface IClient que devem ser implementados pela classe ClientRepository
    void addClient(Client client);
    void removeClient(int idCliente);
    void updateClient(Client client);
    Client getClient(int id);
    List<Client> getAllClients();
}
