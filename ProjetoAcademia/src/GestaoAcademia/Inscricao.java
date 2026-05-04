package GestaoAcademia;

public class Inscricao {
    private Integer id;
    private Integer cliente_id;
    private Integer aula_id;
    private java.time.LocalDateTime dataInscricao;

    public Inscricao(Integer id, Integer cliente_id, Integer aula_id,
                     java.time.LocalDateTime dataInscricao) {
        this.id = id;
        this.cliente_id = cliente_id;
        this.aula_id = aula_id;
        this.dataInscricao = dataInscricao;
    }

    public Integer getId() { return id; }
    public Integer getCliente_id() { return cliente_id; }
    public Integer getAula_id() { return aula_id; }
    public java.time.LocalDateTime getDataInscricao() { return dataInscricao; }

    public void setId(Integer id) { this.id = id; }
    public void setCliente_id(Integer cliente_id) { this.cliente_id = cliente_id; }
    public void setAula_id(Integer aula_id) { this.aula_id = aula_id; }
    public void setDataInscricao(java.time.LocalDateTime d) { this.dataInscricao = d; }
}