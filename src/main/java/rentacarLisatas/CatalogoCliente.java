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
public class CatalogoCliente {

    private List<Cliente> cliente;

    public CatalogoCliente(int numClientes) {
        numClientes = Math.abs(numClientes);
        this.cliente = new ArrayList<>(numClientes);
        for (int i = 0; i < numClientes; i++) {
            this.cliente.add(new Cliente());
        }
    }

    public String toString() {
        String tmp = "";

        for (Cliente c : this.cliente) {

            if (c != null) {
                tmp += c.toString() + "\n";
            }
        }

        return tmp;
    }

    public int getNumeroClientes() {
        return this.cliente.size();
    }

    public Cliente buscarCliente(String nif) {
        Cliente aux = new Cliente();
        aux.setNif(nif);
        int posicion = buscarCliente(aux);
        return (posicion >= 0) ? this.cliente.get(posicion) : null;
    }

    public boolean borrarCliente(Cliente c) {
        int pos = buscarCliente(c);
        if (pos >= 0) {
            this.cliente.remove(c);
            return true;
        }
        return false;
    }

    private int buscarCliente(Cliente c) {
        //Búsqueda secuencial
        if (c != null) {
            for (int i = 0; i < this.cliente.size(); i++) {
                if (c.equals(this.cliente.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void anadirCliente(Cliente c) {
        this.cliente.add(c);
    }
}
