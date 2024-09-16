package src.interfaces;
import src.entities.Enterprise;
import java.util.List;

public interface IEnterprise {
    // Métodos da interface IEnterprise que devem ser implementados pela classe EnterpriseRepository
    void addEnterprise(Enterprise enterprise);
    void removeEnterprise(Enterprise enterprise);
    void updateEnterprise(Enterprise enterprise);
    Enterprise getEnterprise(int id);
    List<Enterprise> getAllEnterprises();
}