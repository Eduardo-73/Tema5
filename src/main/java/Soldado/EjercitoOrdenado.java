/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soldado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author eduar
 */
public class EjercitoOrdenado {
        private Set<Soldado> setSoldado;
    private int numSoldadosN;

    public EjercitoOrdenado(Set<Soldado> setSoldado, int numSoldadosN) {
        this.setSoldado = new TreeSet<>();
        this.numSoldadosN = numSoldadosN;
    }

    public EjercitoOrdenado() {
    }

    public int getNumSoldadosN() {
        return numSoldadosN;
    }

    public void setNumSoldadosN(int numSoldadosN) {
        this.numSoldadosN = numSoldadosN;
    }

    public Set<Soldado> getSoldado() {
        return setSoldado;
    }

    public void setSoldado(Set<Soldado> soldado) {
        this.setSoldado = soldado;
    }

    @Override
    public String toString() {
        return "Ejercito{" + "soldado=" + setSoldado + ", numSoldadosN=" + numSoldadosN + '}';
    }

    //Método que devuelve el número de soldados
    public int saberNumSoldados(Set<Soldado> soldado) {
        return soldado.size();
    }

    public void alistarSoldado(Set<Soldado> soldado) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime tu NIF: ");
        String nif = teclado.nextLine();
        System.out.println("Dime tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Dime tu primer apellido: ");
        String apellido1 = teclado.nextLine();
        System.out.println("Dime tu segundo apellido: ");
        String apellido2 = teclado.nextLine();
        System.out.println("Dime tu edad: ");
        int edad = teclado.nextInt();

        soldado.add(new Soldado(nif, nombre, apellido1, apellido2, edad));
    }

    public boolean saberSoldadoEstaEjercito(Set<Soldado> soldado) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el NIF del soldado: ");
        String nif = teclado.nextLine();

        return soldado.contains(new Soldado(nif, "", "", "", 0));
    }

    public boolean saberEjercitoTieneSoldados(Set<Soldado> soldado) {
        boolean noSoldados = true;
        if (noSoldados) {
            System.out.println("No hay soldados en el ejercito ");
            return soldado.isEmpty();
        } else {
            System.out.println("Hay soldados en el ejercito ");
            return false;
        }
    }

    public void mostrarSoldados() {
        List<Soldado> lista = new ArrayList<>();
        System.out.println(lista.size());
    }

    public void borrarSoldado(Set<Soldado> soldado) {
        Soldado s = new Soldado();
        soldado.remove(s);
    }
}
