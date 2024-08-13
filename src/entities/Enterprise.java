package src.entities;

public class Enterprise extends Client {
    private String cnpj;
    private String corporateName;

    public Enterprise() {
    }

    public Enterprise(String name, String email, String cpf, String phone, String cnpj, String corporateName) {
        super(name, email, cpf, phone);
        this.cnpj = cnpj;
        this.corporateName = corporateName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }
}