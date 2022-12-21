/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarLisatas;


/**
 *
 * @author eduardo
 */
public class CatalogosVehiculos extends Catalogo<Vehiculos> {

    public CatalogosVehiculos(int tamanio) {
        super(tamanio);
    }

    public Vehiculos buscarVehiculos(String bastidor) {
        Vehiculos aux = new Vehiculos();
        aux.setBastidor(bastidor);
        int posicion = this.buscarElemento(aux);
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }

}

