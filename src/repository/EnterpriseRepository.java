package src.repository;

import src.entities.Enterprise;
import src.interfaces.IEnterprise;
import src.services.EnterpriseService;

import java.util.ArrayList;

public class EnterpriseRepository implements IEnterprise {
    private EnterpriseService enterpriseService = new EnterpriseService();
    private ArrayList<Enterprise> enterprises = new ArrayList<>();
    @Override
    public void addEnterprise(Enterprise enterprise) {
        // Adiciona a empresa na Lista
        enterpriseService.addEnterpriseService(enterprise, enterprises);
    }

    @Override
    public void removeEnterprise(Enterprise enterprise) {
        // Remove a empresa da Lista
        enterpriseService.removeEnterpriseService(enterprise, enterprises);
    }

    @Override
    public void updateEnterprise(Enterprise enterprise) {
        // Atualiza a empresa na Lista
        enterpriseService.updateEnterpriseService(enterprise, enterprises);
    }

    @Override
    public Enterprise getEnterprise(String cnpj) {
        // Retorna a empresa pelo CNPJ
        return enterpriseService.getEnterpriseService(cnpj, enterprises);
    }

    @Override
    public ArrayList<Enterprise> getAllEnterprises() {
        // Lista todas empresas registradas
        return enterprises;
    }


}
