/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArray;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author eduar
 */
public class Ej23 {

    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> lista3 = new ArrayList<>();
        ArrayList<Integer> lista4 = new ArrayList<>();
        Random gen = new Random();
        //crear 3 generadores de números randoms 
        int num1 = gen.nextInt(5, 15 + 1);
        int num2 = gen.nextInt(10, 20 + 1);
        int num3;
        //este bucle crea una sucesión de números que van desde el 50 al 100 
        for (int i = 0; i < num1; i++) {
            num3 = gen.nextInt(50, 100 + 1);
            lista1.add(num3);
        }

        for (int i = 0; i < num2; i++) {
            num3 = gen.nextInt(50, 100 + 1);
            lista2.add(num3);
        }
        //muestro en pantalla las listas mediante el forEach
        System.out.println("---------------");
        lista1.forEach(System.out::println);
        System.out.println("---------------");
        lista2.forEach(System.out::println);
        System.out.println("---------------");
        
        //la lista tres contiene la lista no y no la lista 2 
        // y luego la muestro en pantalla
        for (Integer aux : lista1) {
            if (!lista2.contains(aux)) {
                lista3.add(aux);
            }
            
        }
        lista3.forEach(System.out::println);
        
        for (int i = 0; i < lista1.size(); i++) {
           if (lista1.get(i) %2 == 0){
               lista4.add(lista1.get(i));
           }
        }
        
        for (int i = 0; i < lista2.size(); i++) {
           if (lista2.get(i) %3 == 0){
               lista4.add(lista2.get(i));
           }
        }
    }
   
}
