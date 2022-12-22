/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarLisatas;

/**
 *
 * @author eduardo
 */
public class CatalogoCliente extends Catalogo<Cliente> {

    public CatalogoCliente(int tamanio) {
        super(tamanio);
    }

    public Cliente buscarCliente(String nif) {
        Cliente aux = new Cliente();
        aux.setNif(nif);
        int posicion = buscarElemento(aux);
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }

}
