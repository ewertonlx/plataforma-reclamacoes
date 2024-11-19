import src.entities.Client;
import src.repository.ClientRepository;

public class Main {
    public static void main(String[] args) {
        // Instância do objeto Client
        Client client = new Client("Jõao", "joao@gmail.com", "12345678910", "(81) 99999-9999");
        ClientRepository clientRepository = new ClientRepository();
        clientRepository.addClient(client);
        Client client2 = new Client("Maria", "maria@gmail.com", "22233344498", "(81) 11111-1111");
        clientRepository.addClient(client2);
        clientRepository.removeClient(11);
    }
}