/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Ej26<P> {
    
    
    private List<P> pila;
    private final int tamanio = 5;

    public Ej26() {

        this.pila = new ArrayList<>(tamanio);
    }

    public void push(P elemento){
        pila.add(elemento);
    }
    
    public void pop(P elemento){
        for (int i = pila.size(); i < pila.size(); i--) {
             if(elemento.equals(this.pila.get(i)));
        }
        
    }
    
    public boolean pilaVacia(){
        return pila.isEmpty();
    } 
    
    public int numElementos(){
        int numero = pila.size();
        return numero;
    }
    
    public void imprimirDatos(){
        for (P p : pila) {
            System.out.println(p);
        }
    }
    
    public void rellenar(P[] array){
        int tamanio;
        Scanner  teclado = new Scanner(System.in); 
        tamanio = teclado.nextInt();
        tamanio = Math.abs(tamanio);
        
        array = (P[]) new Arrays[tamanio];
    }
    
    public List<P> getPila() {
        return pila;
    }

    public void setPila(List<P> pila) {
        this.pila = pila;
    }

    @Override
    public String toString() {
        return "Ej26{" + "pila=" + pila + '}';
    }

}
