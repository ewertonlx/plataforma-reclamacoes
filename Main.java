import src.entities.Client;
import src.entities.Complaint;
import src.entities.Enterprise;
import src.repository.ClientRepository;
import src.repository.ComplaintRepository;
import src.repository.EnterpriseRepository;;

public class Main {
    public static void main(String[] args) {
        // Instâncias dos repositórios
        ClientRepository clientRepository = new ClientRepository();
        EnterpriseRepository enterpriseRepository = new EnterpriseRepository();
        ComplaintRepository complaintRepository = new ComplaintRepository();

        // Instâncias dos objetos
        Client client = new Client("Joao", "joao@gmail.com", "123.456.789-10", "(81) 9 9999-9999"); // Instância de um cliente
        clientRepository.addClient(client); // Adiciona o cliente no repositório
        System.out.println(clientRepository.getAllClients()); // Lista todos os clientes registrados

        Enterprise enterprise = new Enterprise("ewerton", "ewerton@gmail.com", "987.654.321-00", "(81) 8 8888-8888", "12.345.678/0001-95", "Empresa sensacional");
        enterpriseRepository.addEnterprise(enterprise);
        System.out.println(enterpriseRepository.getAllEnterprises());

        Complaint complaint = new Complaint("TItulo da reclamaçao", "Uma descricao legal", "Pendente", client, enterprise);
        complaintRepository.addComplaint(complaint);
        System.out.println(complaintRepository.getAllComplaints().get(0).getId());

        Complaint complaint2 = new Complaint("TItulo da reclamaçao 2", "Uma descricao legal", "REsolvido", client, enterprise);
        complaintRepository.addComplaint(complaint2);
        System.out.println(complaintRepository.getAllComplaints().get(1).getId());
        
    }
}