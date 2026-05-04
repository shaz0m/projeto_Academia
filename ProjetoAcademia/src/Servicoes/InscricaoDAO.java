package Servicoes;

import conexao.Conexao;
import java.sql.*;

/**
 * Responsável pelas inscrições de clientes em aulas.
 * @author wende
 */
public class InscricaoDAO {

    /**
     * Inscreve um cliente numa aula.
     * @param clienteId id do cliente
     * @param aulaId id da aula
     * @throws SQLException erro de base de dados
     */
    public void inscrever(int clienteId, int aulaId) throws SQLException {
       String sql = "INSERT INTO inscricao (cliente_id, aula_id, data_inscricao) VALUES (?, ?, NOW())";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, clienteId);
            stmt.setInt(2, aulaId);
            stmt.executeUpdate();
        }
    }

    /**
     * Cancela uma inscrição alterando o estado.
     * @param inscricaoId id da inscrição
     * @throws SQLException erro de base de dados
     */
    public void cancelar(int inscricaoId) throws SQLException {
        String sql = "DELETE FROM inscricao WHERE id=?";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, inscricaoId);
            stmt.executeUpdate();
        }
    }
}