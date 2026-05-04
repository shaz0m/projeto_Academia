package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Gere a ligação à base de dados MySQL.
 * Qualquer classe que precise de aceder à BD chama Conexao.getConexao().
 */
public class Conexao {

    private static final String URL = "jdbc:mysql://62.28.39.135:3306/apdz0125_15_gestaoGinasio"
                                    + "?useTimezone=true&serverTimezone=UTC";
    private static final String USUARIO = "apdz0125";
    private static final String SENHA = "123.Abc";

    public static Connection getConexao() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver MySQL não encontrado!");
        }
    }
}