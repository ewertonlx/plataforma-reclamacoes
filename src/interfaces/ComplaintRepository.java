package src.interfaces;
import java.util.List;

import src.entities.Complaint;

public interface ComplaintRepository {
    void addComplaint(Complaint complaint);
    void removeComplaint(Complaint complaint);
    Complaint getComplaint(int id);
    List<Complaint> getAllComplaints();
}