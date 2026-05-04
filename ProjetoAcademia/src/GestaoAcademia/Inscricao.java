package GestaoAcademia;

import java.time.LocalDateTime;

/**
 * Representa a inscrição de um Cliente numa Aula.
 * Liga um cliente a uma aula com uma data e estado.
 * @author wende
 */
public class Inscricao {

    private Integer id;
    private Integer clienteId; 
    private Integer aulaId;    
    private LocalDateTime dataHora;
    private String estado;      

    public Inscricao(Integer id, Integer clienteId, Integer aulaId,
                     LocalDateTime dataHora, String estado) {
        this.id = id;
        this.clienteId = clienteId;
        this.aulaId = aulaId;
        this.dataHora = dataHora;
        this.estado = estado;
    }

    public Integer getId(){
        return id; 
    }
    public Integer getClienteId(){
        return clienteId; 
    }
    public Integer getAulaId(){
        return aulaId; 
    }
    public LocalDateTime getDataHora(){
        return dataHora; 
    }
    public String getEstado(){
        return estado; 
    }

    public void setEstado(String estado) {
        this.estado = estado; 
    }

    @Override
    public String toString() {
        return "Inscricao{id=" + id + ", cliente=" + clienteId +
               ", aula=" + aulaId + ", estado=" + estado + '}';
    }
}