
package GestaoAcademia;


public class Treinador {
    private Integer id;
    private Integer Cliente_id; 
    
    //FOREIGN KEY (cliente_id) REFERENCES cliente(id)

    public Treinador(Integer id, Integer Cliente_id) {
        this.id = id;
        this.Cliente_id = Cliente_id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCliente_id() {
        return Cliente_id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCliente_id(Integer Cliente_id) {
        this.Cliente_id = Cliente_id;
    }
    
    
}
