package src.interfaces;
import java.util.List;
import src.entities.Complaint;

public interface IComplaint {
    // Métodos da interface IComplaint que devem ser implementados pela classe ComplaintRepository
    void addComplaint(Complaint complaint);
    Complaint removeComplaint(int id);
    void updateComplaint(Complaint complaint);
    Complaint getComplaint(int id);
    List<Complaint> getAllComplaints();
}