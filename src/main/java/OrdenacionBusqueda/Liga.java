/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrdenacionBusqueda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class Liga {

    public static void main(String[] args) {

        List<EquiposFútbol> equipos = new ArrayList<>();

        equipos.add(new EquiposFútbol("Málaga", "Azul y blanco", 0, 32));
        equipos.add(new EquiposFútbol("Madrid", "Blanco", 32, 25));
        equipos.add(new EquiposFútbol("Barcelona", "Azul y rojo", 7, 15));
        equipos.add(new EquiposFútbol("Juventus", "Negro y blanco", 10, 50));
        
        equipos.forEach(System.out::println);
        
        System.out.println("---------------");
        
        //Me lo ordena por los nombres 
        Collections.sort(equipos);
        
        equipos.forEach(System.out::println);
        
        
    }
}
