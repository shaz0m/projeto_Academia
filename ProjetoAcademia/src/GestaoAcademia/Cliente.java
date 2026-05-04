
package GestaoAcademia;

import java.time.LocalDate;

/**
 *
 * @author wende
 */
public class Cliente {
    private Integer id;
    private Integer utilizador_id;
    private String nome;
    private String email;
    private String telefone;  // "912345678"
    private java.time.LocalDate data_nascimento;  // data real

    public Cliente(Integer id, Integer utilizador_id, String nome, String email, String telefone, LocalDate data_nascimento) {
        this.id = id;
        this.utilizador_id = utilizador_id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUtilizador_id() {
        return utilizador_id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUtilizador_id(Integer utilizador_id) {
        this.utilizador_id = utilizador_id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }  
}
