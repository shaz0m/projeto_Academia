package Sessao;

import GestaoAcademia.Utilizador;
import GestaoAcademia.Cliente;
import GestaoAcademia.Treinador;

/**
 * Guarda o utilizador autenticado durante a sessão.
 * Qualquer classe do programa pode consultar quem está logado.
 * Usa atributos static para existir uma única instância global.
 * @author wende
 */
public class Sessao {

    private static Utilizador utilizadorAtual;

    public static Utilizador getUtilizadorAtual() {
        return utilizadorAtual;
    }

    public static void setUtilizadorAtual(Utilizador u) {
        utilizadorAtual = u;
    }

    public static void terminarSessao() {
        utilizadorAtual = null;
    }

    /**
     * Verifica se o utilizador logado é treinador.
     * Usa instanceof para verificar o tipo real do objeto.
     */
    public static boolean eTreinador() {
        return utilizadorAtual instanceof Treinador;
    }

    /**
     * Devolve o utilizador como Cliente (se for cliente).
     * @return Cliente ou null se for treinador
     */
    public static Cliente getClienteAtual() {
        if (utilizadorAtual instanceof Cliente) {
            return (Cliente) utilizadorAtual;
        }
        return null;
    }

    /**
     * Devolve o utilizador como Treinador (se for treinador).
     * @return Treinador ou null se for cliente
     */
    public static Treinador getTreinadorAtual() {
        if (utilizadorAtual instanceof Treinador) {
            return (Treinador) utilizadorAtual;
        }
        return null;
    }
} 