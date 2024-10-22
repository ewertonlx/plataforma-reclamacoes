package src.repository;
import src.connection.Conexao;
import src.entities.Client;
import src.interfaces.IClient;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ClientRepository implements IClient {
    // Implementação dos métodos da interface IClient
    @Override
    public void addClient(Client client) {
        String sql = "INSERT INTO cliente (nome, email, cpf, telefone) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, client.getName());
            ps.setString(2, client.getEmail());
            ps.setString(3, client.getCpf());
            ps.setString(4, client.getPhone());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeClient(int idCliente) {
        // Remove o cliente da Lista
        String sql = "DELETE FROM reclamacoesdb.cliente WHERE idCliente = ?";
        try {
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, idCliente);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateClient(Client client) {
        // Atualiza o cliente na Lista
    }

    @Override
    public Client getClient(int id) {
        // Pega o cliente pelo id
        return null;
    }

    @Override
    public List<Client> getAllClients() {
        // Lista todos clientes registrados
        return null;
    }

}