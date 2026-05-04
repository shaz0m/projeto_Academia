/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestaoAcademia;

/**
 *
 * @author wende
 */
public class Utilizador {
    private Integer id;
    private String username;
    private String password;
    private String tipo_utilizador;  // "cliente" ou "treinador"
    private Boolean primeiro_login;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTipo_utilizador() {
        return tipo_utilizador;
    }

    public Boolean getPrimeiro_login() {
        return primeiro_login;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTipo_utilizador(String tipo_utilizador) {
        this.tipo_utilizador = tipo_utilizador;
    }

    public void setPrimeiro_login(Boolean primeiro_login) {
        this.primeiro_login = primeiro_login;
    }
    
    
}

