package Servicoes;

import GestaoAcademia.Cliente;
import GestaoAcademia.Treinador;
import GestaoAcademia.Utilizador;
import conexao.Conexao;
import java.sql.*;

/**
 * Responsável pelas operações de base de dados de utilizadores.
 * Gere clientes e treinadores numa única tabela.
 * @author wende
 */
public class UtilizadorDAO {

    /**
     * Verifica login e password na base de dados.
     * Devolve Cliente ou Treinador conforme o tipo.
     * @param login username
     * @param password password
     * @return Utilizador autenticado ou null se falhar
     * @throws SQLException erro de base de dados
     */
    public Utilizador autenticar(String login, String password) throws SQLException {
        String sql = "SELECT * FROM utilizador WHERE username=? AND password=?";
        try (Connection conn = Conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, login);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int id            = rs.getInt("id");
                String nome       = rs.getString("username");
                String tipo       = rs.getString("tipo_utilizador");
                boolean primLogin = rs.getBoolean("primeiro_login");

                if (tipo.equals("treinador")) {
                    // especialidade está na tabela treinador, não em utilizador
                    Treinador t = new Treinador(id, nome, login, password, "");
                    t.setPrimeiroLogin(primLogin);
                    return t;
                } else {
                    // mensalidade está na tabela cliente, não em utilizador
                    Cliente c = new Cliente(id, nome, login, password);
                    c.setPrimeiroLogin(primLogin);
                    return c;
                }
            }
            return null;
        }
    }

    /**
     * Altera a password do utilizador na base de dados.
     * Marca primeiro_login como 0 após alteração.
     * @param id id do utilizador
     * @param novaPassword nova senha
     * @throws SQLException erro de base de dados
     */
    public void alterarPassword(int id, String novaPassword) throws SQLException {
        String sql = "UPDATE utilizador SET password=?, primeiro_login=0 WHERE id=?";
        try (Connection conn = Conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, novaPassword);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        }
    }
}