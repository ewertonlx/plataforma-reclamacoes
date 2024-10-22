package src.entities;

public class Client {
    // Atributos
    private int codigo;
    private String name;
    private String email;
    private String cpf;
    private String phone;
    
    // Construtor padrão
    public Client() {
    }

    // Construtor com parâmetros
    public Client(String name, String email, String cpf, String phone) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.phone = phone;
    }

    // Getters e Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}