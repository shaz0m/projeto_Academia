package GestaoAcademia;

public class Sessao {
    private Integer id;
    private String nome;
    private java.time.LocalDateTime dataHoraInicio;
    private Integer duracao;       // em minutos
    private Integer capacidade;
    private Integer treinador_id;

    public Sessao(Integer id, String nome, java.time.LocalDateTime dataHoraInicio,
                  Integer duracao, Integer capacidade, Integer treinador_id) {
        this.id = id;
        this.nome = nome;
        this.dataHoraInicio = dataHoraInicio;
        this.duracao = duracao;
        this.capacidade = capacidade;
        this.treinador_id = treinador_id;
    }

    public Integer getId() { return id; }
    public String getNome() { return nome; }
    public java.time.LocalDateTime getDataHoraInicio() { return dataHoraInicio; }
    public Integer getDuracao() { return duracao; }
    public Integer getCapacidade() { return capacidade; }
    public Integer getTreinador_id() { return treinador_id; }

    public void setId(Integer id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setDataHoraInicio(java.time.LocalDateTime d) { this.dataHoraInicio = d; }
    public void setDuracao(Integer duracao) { this.duracao = duracao; }
    public void setCapacidade(Integer capacidade) { this.capacidade = capacidade; }
    public void setTreinador_id(Integer treinador_id) { this.treinador_id = treinador_id; }
}