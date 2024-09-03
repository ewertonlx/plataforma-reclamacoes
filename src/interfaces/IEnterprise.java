package src.interfaces;
import src.entities.Enterprise;
import java.util.List;

public interface IEnterprise {
    void addEnterprise(Enterprise enterprise);
    void removeEnterprise(Enterprise enterprise);
    void updateEnterprise(Enterprise enterprise);
    Enterprise getEnterprise(int id);
    List<Enterprise> getAllEnterprises();
}