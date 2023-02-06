/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArray;

import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class Ej26Pila<P> {

    private ArrayList<P> pila;
    private int tamanio;

    public Ej26Pila(int tamanio) {
        this.pila = new ArrayList<>(tamanio);
    }

    public void push(P elemento) {
        pila.add(elemento);
    }

    public void pop() {
        pila.remove(pila.size() - 1);
    }

    public boolean pilaVacio() {
        return pila.isEmpty();
    }

    public boolean pilaLlena() {
        if (pila.size() == tamanio) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarPila(){
        for (int i = 0; i < pila.size(); i++) {
            System.out.println(pila.get(i));
        }
    }
    
    public void rellenarArray(P[] Array){
        for (int i = 0; i < Array.length; i++) {
            pila.add(Array[i]);
        }
    }
    
    public Object[] sacarElementos(){
        Object[] objeto = pila.toArray();
        pila.removeAll(pila);
        return objeto;
    }
    
    public ArrayList<P> getPila() {
        return pila;
    }

    public void setPila(ArrayList<P> pila) {
        this.pila = pila;
    }

    @Override
    public String toString() {
        return "Ej26Pila{" + "pila=" + pila + '}';
    }

}
