/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarLisatas;

import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class CatalogoAlquiler extends Catalogo<Alquileres> {

    public CatalogoAlquiler(int tamanio) {
        super(tamanio);
    }

    public Alquileres buscarAlquiler(int id) {
        Alquileres aux = new Alquileres();
        aux.setAlquilerID(id);
        int posicion = buscarElemento(aux);
        return (posicion >= 0) ? this.lista.get(id) : null;
    }

    public Alquileres buscarAlquilerCliente(String nif) {
        Alquileres aux = new Alquileres();
        ArrayList listaCliente = new ArrayList<Alquileres>(); 
        for (Alquileres a : this.lista) {
            if (nif.equals(a.getCliente().getNif())) {
                listaCliente.add(aux);
            }
        }
        return aux;
    }
    
    public Alquileres buscarAlquilerVehiculo(String bastidor) {
        Alquileres aux = new Alquileres();
        ArrayList listaCliente = new ArrayList<Alquileres>(); 
        for (Alquileres a : this.lista) {
            if (bastidor.equals(a.getVehiculo().getBastidor())) {
                listaCliente.add(aux);
            }
        }
        return aux;
    }
}
