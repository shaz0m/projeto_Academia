package GestaoAcademia;

/**
 * Representa um Cliente do ginásio.
 * Herda de Utilizador.
 * @author wende
 */
public class Cliente extends Utilizador {

    private String email;
    private String telefone;
    private java.time.LocalDate dataNascimento;

    /**
     * Construtor do Cliente.
     * @param id identificador único
     * @param nome nome
     * @param login username
     * @param password password
     */
    public Cliente(Integer id, String nome, String login, String password) {
        super(id, nome, login, password);
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public java.time.LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(java.time.LocalDate d) { this.dataNascimento = d; }

    @Override
    public String toString() {
        return "Cliente{id=" + getId() + ", nome=" + getNome() + '}';
    }
}