/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarLisatas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
//Clase genérica, sirve para cualquier tipo de objeto
public class Catalogo<T> {

    protected List<T> lista;

    public Catalogo(int tamanio) {
        tamanio = Math.abs(tamanio);
        this.lista = new ArrayList<>(tamanio);
        //lista.size() es = 0
        //Una vex creada la estructura de datos le doy
        //valor a cada elemento

    }

    public String toString() {
        String tmp = "";

        for (T objeto : this.lista) {

            if (objeto != null) {
                tmp += objeto.toString() + "\n";
            }
        }

        return tmp;
    }

    public int getNumeroElemento() {
        return this.lista.size();
    }

    public int buscarElemento(T elemento) {
        //Busqueda secuencial
        for (int i = 0; i < this.lista.size(); i++) {
            if (elemento.equals(this.lista.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public boolean borrarElemento(T elemento) {
        int pos = buscarElemento(elemento);
        if (pos >= 0) {
            this.lista.remove(elemento);
            return true;
        }
        return false;
    }

    public void anadirElemento(T elemento) {
        this.lista.add(elemento);
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }

    
}
