package src.repository;
import src.entities.Client;
import src.interfaces.IClient;
import src.services.ClientService;

import java.util.ArrayList;

public class ClientRepository implements IClient {
    private ClientService clientService = new ClientService();
    private ArrayList<Client> clients = new ArrayList<>();
    // Implementação dos métodos da interface IClient
    @Override
    public void addClient(Client client) {
        // Adiciona o cliente na Lista
        clientService.addClientService(client, clients);
    }

    @Override
    public void removeClient(Client client) {
        // Remove o cliente da Lista
        clientService.removeClientService(client, clients);
    }

    @Override
    public void updateClient(Client client) {
        // Atualiza o cliente na Lista
        clientService.updateClientService(client, clients);
    }

    @Override
    public Client getClient(String cpf) {
        // Retorna o cliente pelo CPF
        return clientService.getClientService(cpf, clients);
    }

    @Override
    public ArrayList<Client> getAllClients() {
        // Lista todos clientes registrados
        return clients;
    }

}