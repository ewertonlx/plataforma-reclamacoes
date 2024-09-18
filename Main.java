import src.entities.Client;
import src.entities.Complaint;
import src.repository.ClientRepository;
import src.repository.ComplaintRepository;

public class Main {
    public static void main(String[] args) {
        // Instâncias dos repositórios
        ComplaintRepository complaintRepository = new ComplaintRepository();
        ClientRepository clientRepository = new ClientRepository();

        Client client = new Client("João", "joao@gmail.com", "123.456.789-10", "(81) 99999-9999");
        clientRepository.addClient(client);

        Complaint complaint = new Complaint("Reclamação 1", "Descrição 1", "Aberto", client, null);
        Complaint complaint2 = new Complaint("Reclamação 2", "Descrição 2", "Aberto", client, null);

        // Adiciona reclamações à fila
        complaintRepository.addComplaint(complaint);
        complaintRepository.addComplaint(complaint2);

        // Remove e processa reclamações da fila
        complaintRepository.removeComplaint(complaint.getId());
        while (complaint != null) {
            System.out.println("Processando: " + complaint.getTitle());
            complaint = complaintRepository.removeComplaint(complaint.getId());
        }
        
    }
}