package GestaoAcademia;

/**
 * Representa um Treinador do ginásio.
 * Herda de Utilizador, acrescentando a especialidade do treinador.
 * @author wende
 */
public class Treinador extends Utilizador {

    private String especialidade;

    /**
     * Construtor do Treinador.
     * @param id identificador único
     * @param nome nome completo
     * @param login username
     * @param password password
     * @param especialidade área de especialização (ex: Musculação)
     */
    // ✅ CORRETO
    public Treinador(Integer id, String nome, String login,
                 String password, String especialidade) {
    super(id, nome, login, password);  // passa para Utilizador
    this.especialidade = especialidade;
}

    public String getEspecialidade() { 
        return especialidade; 
    }
    public void setEspecialidade(String especialidade) { 
        this.especialidade = especialidade; 
    }

    @Override
    public String toString() {
        return "Treinador{id=" + getId() + ", nome=" + getNome() +
               ", especialidade=" + especialidade + '}';
    }
}