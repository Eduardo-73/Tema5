/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosClase;

import java.util.Arrays;

/**
 *
 * @author eduar
 */
public class CatalogoCliente {

    private int numeroCliente;
    private Cliente[] listaCliente;

    public CatalogoCliente(int numClientes) {
        //Según el número de clientes que pongamos en el constructor se hara 
        //un Arrays del tamaño añadido
        this.numeroCliente = numeroCliente;
        this.listaCliente = new Cliente[numClientes];
        for (int i = 0; i < this.listaCliente.length; i++) {
            this.listaCliente[i] = new Cliente();
        }
    }

    public void borrarCliente(Cliente c) {
        int posicion = buscarCliente(c);
        if (posicion >= 0) {
            this.listaCliente[posicion] = null;
        }
    }

    public int buscarCliente(Cliente c) {
        for (int i = 0; i < this.listaCliente.length; i++) {
            if (c.equals(this.listaCliente[i])) {
                return i;
            }
        }
        return -1;
    }

    public void anadirCliente(Cliente c) {
        //Se añade un nuevo cliente siempe que haya un hueco en el suceso 
        if (this.numeroCliente < this.listaCliente.length) {
            for (int i = 0; i < this.listaCliente.length; i++) {
                if (this.listaCliente[i] == null) {
                    this.listaCliente[i] = c;
                    this.numeroCliente++;
                }
            }
        } else {
            this.numeroCliente++;
            this.listaCliente = Arrays.copyOf(listaCliente,
                    numeroCliente);
            this.listaCliente[this.numeroCliente - 1] = c;
        }
    }

    public String toString(){
        String  tmp = "";
        
        for (Cliente c : listaCliente) {
            if(c != null){
                tmp += c.toString() + "\n";
            }
            
        }
        return tmp;
    }
    
      private Cliente[] copiar() {
        Cliente[] c = new Cliente[this.numeroCliente + 1];
        
        for (int i = 0; i < this.listaCliente.length; i++) {
            c[i] = this.listaCliente[i];
        }
        return c;
    }
      
      public int getNumeroCliente(){
          return numeroCliente;
      }
}
