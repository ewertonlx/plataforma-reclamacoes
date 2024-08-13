package src.entities;

public class Complaint {
    private String title;
    private String description;
    private int id;
    private String status;
    private Client client;

    public Complaint() {
    }

    public Complaint(String title, String description,int id, String status, Client client) {
        this.title = title;
        this.description = description;
        this.id = id;
        this.status = status;
        this.client = client;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public Client getClient() {
        return client;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}