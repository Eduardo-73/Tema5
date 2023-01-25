/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrdenacionBusqueda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class OrdenacionBusqueda {

    public static void main(String[] args) {

        List<País> paises = new ArrayList<>();

        paises.add(new País("España", 46, 505_400, "Euro"));
        paises.add(new País("Portugal", 23, 54_658, "Euro"));
        paises.add(new País("EEUU", 100, 856_585, "Dolar"));
        paises.add(new País("Italia", 46, 505_400, "Euro"));

        paises.forEach(System.out::println);

        //Ordenar por monedas
        /* Collection tiene : ordenación(sort) ==> implementan <<Comparable>> (hay que darle codigo al comperto)/ <<Comparator>>
         busqueda (binaryseach)  ==> implementan <<Comparable>> / <<Comparator>>
         */
        System.out.println("-----------------");
        //Ordenación usando comparator natural (requiere que país implemente Comparable 
        Collections.sort(paises);

        paises.forEach(System.out::println);
        //Ordenación usando comparator (proporcionamos el criterio)
        //mediante una lamda
        System.out.println("-----------------");
        //Orden normal
        //Collections.sort(paises, (p1,p2)-> Long.compare(p1.getPoblacion(), p2.getPoblacion()));
        Comparator<País> criterioPoblacion = (p1, p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion());
        //Orden del reves
        Collections.sort(paises, criterioPoblacion.reversed());

        paises.forEach(System.out::println);
        
        System.out.println("-----------------");
        
        Comparator<País> criterioSuperficie = (p1, p2) -> Long.compare(p1.getSuperficie(), p2.getSuperficie());
        
        Collections.sort(paises, criterioSuperficie);

        paises.forEach(System.out::println);
        
        System.out.println("-----------------");
        
        Comparator<País> criterioNombre = (p1, p2) -> p1.getNombre().compareToIgnoreCase( p2.getNombre());
        
        Collections.sort(paises, criterioSuperficie.thenComparing(criterioNombre));

        paises.forEach(System.out::println);
    }
}
