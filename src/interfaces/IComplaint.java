package src.interfaces;
import java.util.List;
import src.entities.Complaint;

public interface IComplaint {
    void addComplaint(Complaint complaint);
    void removeComplaint(Complaint complaint);
    void updateComplaint(Complaint complaint);
    Complaint getComplaint(int id);
    List<Complaint> getAllComplaints();
}