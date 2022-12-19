/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArray;

import java.util.Random;

/**
 *
 * @author eduar
 */
public class Ej15 {

    private boolean[] moneda;

    public Ej15() {
        this.moneda = new boolean[1000];
    }

    public void lanzarMonedas() {
        Random gen = new Random();
        for (int i = 0; i < moneda.length; i++) {
            moneda[i] = gen.nextBoolean();
        }
    }

    public int contarCaras() {
        int contador = 0;
        for (boolean b : moneda) {
            if (b == true) {
                contador++;
            }
        }
        return contador;
    }

    public int contarCruces() {
        int contador = 0;
        for (int i = 0; i < moneda.length; i++) {
            //También podria ser if(moneda[i]==false)
            if (moneda[i] != true) {
                contador++;
            }
        }
        return contador;
    }

    public void mostrarResultado() {
        for (int i = 0; i < moneda.length; i++) {
            System.out.println((i + 1) + " ha salido " + moneda[i]);
        }
    }
    
    
}
