/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarLisatas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class CatalogosVehiculos {

    private List<Vehiculos> lista;


    public CatalogosVehiculos(int tamanio) {
        tamanio = Math.abs(tamanio);
        this.lista = new ArrayList<>(tamanio);
        for (int i = 0; i < tamanio; i++) {
            this.lista.add(new Vehiculos());
        }
    }

    public String toString() {
        String tmp = "";

        for (Vehiculos v : this.lista) {

            if (v != null) {
                tmp += v.toString() + "\n";
            }
        }

        return tmp;
    }

    public int getNumeroVehiculos() {
        return this.lista.size();
    }

    public boolean borrarVehiculo(Vehiculos v) {
        int pos = buscarVehiculo(v);
        if (pos >= 0) {
            this.lista.remove(v);
            return true;
        }
        return false;
    }

    public Vehiculos buscarVehiculos(String bastidor) {
        Vehiculos aux = new Vehiculos();
        aux.setBastidor(bastidor);
        int posicion = buscarVehiculo(aux);
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }

    private int buscarVehiculo(Vehiculos v) {
        //Búsqueda secuencial
        if (v != null) {
            for (int i = 0; i < this.lista.size(); i++) {
                if (v.equals(this.lista.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void anadirVehiculo(Vehiculos v) {
       this.lista.add(v);
    }
}
