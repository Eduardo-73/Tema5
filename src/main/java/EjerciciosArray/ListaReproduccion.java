/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author eduar
 */
public class ListaReproduccion {

    private List<Cancion> canciones;

    public ListaReproduccion() {
        this.canciones = new ArrayList<>();
    }

    public Cancion numeroCanciones(int numero) {
        return this.canciones.get(numero);
    }

    public boolean estaVacia() {
        int posicon = 1;
        boolean vacio;
        return (posicon >= 0) ?  : this.canciones.add(vacio);
    }

    public Cancion escucharCancion(int posicion) {
        Cancion c = new Cancion();
        for (int i = 0; i < this.canciones.size(); i++) {
            if (c.equals(this.canciones.get(i))) {
                return i;
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.canciones);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ListaReproduccion other = (ListaReproduccion) obj;
        return Objects.equals(this.canciones, other.canciones);
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "ListaReproduccion{" + "canciones=" + canciones + '}';
    }

}
