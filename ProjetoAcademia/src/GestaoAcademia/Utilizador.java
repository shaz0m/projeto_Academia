package GestaoAcademia;

/**
 * Classe base para todos os utilizadores do sistema.
 * @author wende
 */
public class Utilizador {
    private Integer id;
    private String nome;
    private String login;
    private String password;
    private boolean primeiroLogin;

    public Utilizador(Integer id, String nome, String login, String password) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.password = password;
        this.primeiroLogin = true; // por defeito é sempre true
    }

    public Integer getId() {
    return id; 
    }
    public String getNome() { 
     return nome; 
    }
    public String getLogin() { 
    return login; 
    }
    public String getPassword() { 
    return password; 
    }
    public boolean isPrimeiroLogin() {
    return primeiroLogin; 
    }

    public void setPassword(String password) {
    this.password = password; 
    }
    public void setPrimeiroLogin(boolean p) { 
    this.primeiroLogin = p; 
    }
}