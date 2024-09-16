package src.repository;
import src.entities.Client;
import src.interfaces.IClient;
import java.util.List;

public class ClientRepository implements IClient {
    // Implementação dos métodos da interface IClient
    @Override
    public void addClient(Client client) {
        // Adiciona o cliente na Lista
    }

    @Override
    public void removeClient(Client client) {
        // Remove o cliente da Lista
    }

    @Override
    public void updateClient(Client client) {
        // Atualiza o cliente na Lista
    }

    @Override
    public Client getClient(int id) {
        // Pega o cliente pelo id
        return null;
    }

    @Override
    public List<Client> getAllClients() {
        // Lista todos clientes registrados
        return null;
    }

}