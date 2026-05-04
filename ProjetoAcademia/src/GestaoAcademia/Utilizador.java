package GestaoAcademia;

import java.util.Objects;

/**
 * Classe base que representa qualquer utilizador do sistema.
 * É a classe pai de Cliente e Treinador.
 * Contém os atributos comuns a todos os utilizadores.
 * @author wende
 */
public class Utilizador {

    private Integer id;
    private String nome;
    private String login;
    private String password;
    private String tipo; // "cliente" ou "treinador"

    /**
     * Construtor completo do Utilizador.
     * @param id identificador único
     * @param nome nome completo
     * @param login username para autenticação
     * @param password password para autenticação
     * @param tipo tipo de utilizador (cliente ou treinador)
     */
    public Utilizador(Integer id, String nome, String login, 
                  String password, String tipo, boolean primeiroLogin) {
    this.id = id;
    this.nome = nome;
    this.login = login;
    this.password = password;
    this.tipo = tipo;
    this.primeiroLogin = primeiroLogin;
    }
    
    private boolean primeiroLogin;

    public boolean isPrimeiroLogin() { 
    return primeiroLogin; 
    }
    public void setPrimeiroLogin(boolean primeiroLogin) { 
    this.primeiroLogin = primeiroLogin; 
    }

   
    public Integer getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getLogin(){
        return login;
    }
    public String getPassword(){ 
        return password; 
    }
    public String getTipo(){ 
        return tipo; 
    }

   
    public void setId(Integer id){
        this.id = id; 
    }
    public void setNome(String nome){
        this.nome = nome; 
    }
    public void setLogin(String login){
        this.login = login; 
    }
    public void setPassword(String pass){
        this.password = pass; 
    }
    public void setTipo(String tipo){
        this.tipo = tipo; 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Utilizador other = (Utilizador) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    @Override
    public String toString() {
        return "Utilizador{id=" + id + ", nome=" + nome + 
               ", tipo=" + tipo + '}';
    }
}