import src.entities.Client;

public class Main {
    public static void main(String[] args) {
        // Instância do objeto Client
        Client client = new Client("Jõao", "joao@gmail.com", "123.456.789-10", "(81) 99999-9999");
        client.getName(); // Saída: João
    }
}