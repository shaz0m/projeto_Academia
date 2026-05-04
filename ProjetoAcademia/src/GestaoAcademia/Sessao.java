package GestaoAcademia;



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
    
    public static boolean eTreinador() {
        return utilizadorAtual instanceof Treinador;
    }
    public static Cliente getClienteAtual() {
        if (utilizadorAtual instanceof Cliente) return (Cliente) utilizadorAtual;
        return null;
    }
    public static Treinador getTreinadorAtual() {
        if (utilizadorAtual instanceof Treinador) return (Treinador) utilizadorAtual;
        return null;
    }
}