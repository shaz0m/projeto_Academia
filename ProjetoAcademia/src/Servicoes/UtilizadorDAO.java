package Servicoes;

import GestaoAcademia.Cliente;
import GestaoAcademia.Treinador;
import GestaoAcademia.Utilizador;
import conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
    public Utilizador autenticar(String login, String password) 
        throws SQLException {

    String sql = "SELECT * FROM utilizador WHERE username=? AND password=?";

    try (Connection conn = Conexao.getConexao();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, login);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            int id              = rs.getInt("id");
            String nome         = rs.getString("nome");
            String tipo         = rs.getString("tipo");
            boolean primLogin   = rs.getBoolean("primeiro_login");

            if (tipo.equals("treinador")) {
                Treinador t = new Treinador(id, nome, login, password,
                                            rs.getString("especialidade"));
                t.setPrimeiroLogin(primLogin);
                return t;
            } else {
                Cliente c = new Cliente(id, nome, login, password,
                                        rs.getDouble("mensalidade"));
                c.setPrimeiroLogin(primLogin);
                return c;
            }
        }
        return null;
    }
}
}