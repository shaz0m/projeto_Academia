package core;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * Lista que avisa automaticamente os ouvintes sempre que é modificada.
 * Usa o padrão Observer para notificar a interface gráfica de mudanças.
 */
public class ArrayAcademia<E> extends ArrayList<E> {

    public static final String ADICIONAR_ITEM = "ADD_ITEM";
    public static final String REMOVER_ITEM = "REMOVE_ITEM";
    public static final String LIMPAR_ITENS = "CLEAR_ITEMS";
    public static final String ALTERAR_ITEM = "CHANGE_ITEM";

    private final PropertyChangeSupport suporteEventos;

    public ArrayAcademia() {
        this.suporteEventos = new PropertyChangeSupport(this);
    }

    public ArrayAcademia(int capacidadeInicial) {
        super(capacidadeInicial);
        this.suporteEventos = new PropertyChangeSupport(this);
    }

    public ArrayAcademia(Collection<? extends E> c) {
        super(c);
        this.suporteEventos = new PropertyChangeSupport(this);
    }

    @Override
    public boolean add(E elemento) {
        boolean resultado = super.add(elemento);
        suporteEventos.firePropertyChange(ADICIONAR_ITEM, null, elemento);
        return resultado;
    }

    @Override
    public void add(int indice, E elemento) {
        super.add(indice, elemento);
        suporteEventos.firePropertyChange(ADICIONAR_ITEM, null, elemento);
    }

    @Override
    public void clear() {
        super.clear();
        suporteEventos.firePropertyChange(LIMPAR_ITENS, null, null);
    }

    @Override
    public boolean remove(Object elemento) {
        boolean resultado = super.remove(elemento);
        suporteEventos.firePropertyChange(REMOVER_ITEM, elemento, null);
        return resultado;
    }

    @Override
    public E remove(int indice) {
        E removido = super.remove(indice);
        suporteEventos.firePropertyChange(REMOVER_ITEM, removido, null);
        return removido;
    }

    @Override
    public boolean removeIf(Predicate<? super E> filtro) {
        boolean resultado = super.removeIf(filtro);
        if (resultado) {
            suporteEventos.firePropertyChange(REMOVER_ITEM, null, null);
        }
        return resultado;
    }

    @Override
    public boolean removeAll(Collection<?> colecao) {
        boolean resultado = super.removeAll(colecao);
        if (resultado) {
            suporteEventos.firePropertyChange(REMOVER_ITEM, colecao, null);
        }
        return resultado;
    }

    @Override
    protected void removeRange(int inicio, int fim) {
        super.removeRange(inicio, fim);
        suporteEventos.firePropertyChange(REMOVER_ITEM, inicio, fim);
    }

    @Override
    public E set(int indice, E elemento) {
        E anterior = super.set(indice, elemento);
        suporteEventos.firePropertyChange(ALTERAR_ITEM, anterior, elemento);
        return anterior;
    }

    // Métodos para registar e remover ouvintes
    public void adicionarOuvinte(PropertyChangeListener ouvinte) {
        suporteEventos.addPropertyChangeListener(ouvinte);
    }

    public void removerOuvinte(PropertyChangeListener ouvinte) {
        suporteEventos.removePropertyChangeListener(ouvinte);
    }

    public void adicionarOuvinte(String nomeEvento, PropertyChangeListener ouvinte) {
        suporteEventos.addPropertyChangeListener(nomeEvento, ouvinte);
    }

    public void removerOuvinte(String nomeEvento, PropertyChangeListener ouvinte) {
        suporteEventos.removePropertyChangeListener(nomeEvento, ouvinte);
    }
}