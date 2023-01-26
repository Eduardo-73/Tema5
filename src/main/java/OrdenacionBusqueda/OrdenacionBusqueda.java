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

        Comparator<País> criterioNombre = (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre());

        Collections.sort(paises, criterioSuperficie.thenComparing(criterioNombre));

        paises.forEach(System.out::println);

        //Busqueda por orden natural(po nombre)
        //Lalista donde buscar la información debe estar  ordenada previamente
        //según el criterio de orden natural(nombre) --> Comparable en País
        //Ordena la lista de países por superficie y luego por población
        //Collections.sort(paises,criterioSuperficie);
        //Collections.sort(paises, criterioPoblacion);
        /*
        Clase Pojo (orden natural)
            <<Comparable>>
                implementar métodos abstractos
                    compareTo (Objeto o Pojo)
         */
        Collections.sort(paises);

        System.out.println("-------------- Búsqueda binaria ---------------");
        System.out.println("Lista ordenada según orden natural (nombre) ---------------");
        paises.forEach(System.out::println);

        País objetoBuscar = new País();
        objetoBuscar.setNombre("EEUU");//Lista ordenada por nombre, búsqueda por nombre, key es nombre
        int posicion = Collections.binarySearch(paises, objetoBuscar);

        System.out.println("Portugal está en la posición " + posicion);

        //Si intento buscar en la lista con un valor que no es nombre se puede 
        //obtener una posición erróenea
        objetoBuscar.setNombre("");
        objetoBuscar.setPoblacion(23);

        posicion = Collections.binarySearch(paises, objetoBuscar);

        System.out.println(posicion);

        //Si ordeno la lista por un criterio y busco por otro, el resultado es inesperado
        posicion = Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);

        System.out.println(posicion);
        
        System.out.println("-----Ordenación y busqueda por población----------");
        //Antes de usar binarySeach por población la lista debe estar ordenada por población
        Collections.sort(paises, criterioPoblacion);
        paises.forEach(System.out::println);
        objetoBuscar = new País();
        objetoBuscar.setPoblacion(146);
        
        posicion = Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);
        System.out.println("El país que tiene 146 millones es " + paises.get(posicion));
       
        
    }
}
