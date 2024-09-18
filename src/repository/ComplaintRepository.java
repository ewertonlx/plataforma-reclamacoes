package src.repository;

import src.entities.Complaint;
import src.interfaces.IComplaint;
import src.services.ComplaintService;

import java.util.ArrayList;

public class ComplaintRepository implements IComplaint {
    private ComplaintService complaintService = new ComplaintService();
    private ArrayList<Complaint> complaints = new ArrayList<>();

    @Override
    public void addComplaint(Complaint complaint) {
        // Adiciona a reclamação na Lista
        complaintService.addComplaintService(complaint, complaints);
    }

    @Override
    public void removeComplaint(Complaint complaint) {
        // Remove a reclamação da Lista
        complaintService.removeComplaintService(complaint, complaints);
    }

    @Override
    public void updateComplaint(Complaint complaint) {
        // Atualiza a reclamação na Lista
        complaintService.updateComplaintService(complaint, complaints);
    }

    @Override
    public Complaint getComplaint(int id) {
        // Retorna a reclamação pelo ID
        return complaintService.getComplaintService(id, complaints);
    }

    @Override
    public ArrayList<Complaint> getAllComplaints() {
        // Lista todas reclamações registradas
        return complaints;
    }
}
