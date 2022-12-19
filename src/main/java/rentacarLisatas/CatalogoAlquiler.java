/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarLisatas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class CatalogoAlquiler {

    private List<Alquileres> alquiler;

    public CatalogoAlquiler(int alquiler) {
        alquiler = Math.abs(alquiler);
        this.alquiler = new ArrayList<>(alquiler);
        for (int i = 0; i < alquiler; i++) {
            this.alquiler.add(new Alquileres());
        }
    }

    public String toString() {
        String tmp = "";

        for (Alquileres a : this.alquiler) {

            if (a != null) {
                tmp += a.toString() + "\n";
            }
        }

        return tmp;
    }

    public int getNumeroAlquiler() {
        return this.alquiler.size();
    }

    public Alquileres buscarAlquiler(int id) {
        Alquileres aux = new Alquileres();
        aux.setAlquilerID(id);
        int posicion = buscarAlquiler(aux);
        return (posicion >= 0) ? this.alquiler.get(id) : null;
    }

    public boolean borrarAlquiler(Alquileres a) {
        int pos = buscarAlquiler(a);
        if (pos >= 0) {
            this.alquiler.remove(a);
            return true;
        }
        return false;
    }

    private int buscarAlquiler(Alquileres a) {
        //Búsqueda secuencial
        if (a != null) {
            for (int i = 0; i < this.alquiler.size(); i++) {
                if (a.equals(this.alquiler.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void anadirAlquiler(Alquileres a) {
        this.alquiler.add(a);
    }
}
