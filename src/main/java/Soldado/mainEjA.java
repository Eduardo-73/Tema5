/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soldado;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author eduar
 */
public class mainEjA {
    public static void main(String[] args) {
        
        
        Set<Soldado> soldado = new HashSet<>();
        Ejercito infanteria = new Ejercito();
        
        soldado.add(new Soldado("12769237A", "Marta", "Villuela", "Iniesta", 28));
        soldado.add(new Soldado("12769237B", "Ana", "Zapata", "Palenzuela", 67));
        soldado.add(new Soldado("12769237C", "Pepe", "Alcantara", "Castillo", 34));
        soldado.add(new Soldado("12769237D", "Antonio", "Ramos", "Maradona", 42));
        
        infanteria.alistarSoldado(soldado);
        infanteria.saberNumSoldados(soldado);
        infanteria.saberEjercitoTieneSoldados(soldado);
        infanteria.saberSoldadoEstaEjercito(soldado);
        infanteria.borrarSoldado(soldado);
    }
}
