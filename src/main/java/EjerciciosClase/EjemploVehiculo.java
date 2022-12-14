/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosClase;

/**
 *
 * @author eduardo
 */
public class EjemploVehiculo {

    public static void main(String[] args) {

        Vehiculos v = new Vehiculos();
        Cliente c = new Cliente("146879345G", "PACO", "LEÓN");
        CatalogosVehiculos catalogo = new CatalogosVehiculos(5);
        CatalogoCliente catalogo2 = new CatalogoCliente(3);

        System.out.println(v);
        System.out.println(c);
        System.out.println("Nº vehículo del catálogo: " + catalogo.getNumeroVehiculos());
        System.out.println(catalogo);

        System.out.println("--------- Después de borrar el de la posición 3 ----------");
        System.out.println("Nº vehículo del catálogo: " + catalogo.getNumeroVehiculos());
        System.out.println(catalogo);
        
        System.out.println("Nº cliente del catálogo: " + catalogo2.getNumeroCliente());
        System.out.println(catalogo2);

        System.out.println("--------- Después de borrar el de la posición 3 ----------");
        System.out.println("Nº cliente del catálogo: " + catalogo2.getNumeroCliente());
        System.out.println(catalogo2);
        
 
    }
}

//        System.out.println(v);
//        Modelo aleatorio = Modelo.getAleatorio();
//        
//        System.out.println("El modelo aleatorio es " + aleatorio.getModelo());
//        
//        System.out.println("Color " + Color.getAleatorio());      
//        System.out.println("Nº vehículo del catálogo: " + catalogo.getNumeroVehiculos());
//        System.out.println(catalogo);
//
//        System.out.println("--------- Después de borrar el de la posición 3 ----------");
//        System.out.println("Nº vehículo del catálogo: " + catalogo.getNumeroVehiculos());
//        System.out.println(catalogo);
//
//        Vehiculos aux = new Vehiculos();
//        aux.setBastidor("148456123");
//        catalogo.anadirVehiculo(aux);
//
//        System.out.println("--------- Después de borrar el de la posición 3 ----------");
//        System.out.println("Nº vehículo del catálogo: " + catalogo.getNumeroVehiculos());
//        System.out.println(catalogo);
//
//        aux.setBastidor("99999999999");
//        catalogo.anadirVehiculo(aux);
//        System.out.println("--------- Después de borrar el de la posición 3 ----------");
//        System.out.println("Nº vehículo del catálogo: " + catalogo.getNumeroVehiculos());
//        System.out.println(catalogo);
//        
//        catalogo.mostrarCatalogo();
//        
//        Vehiculos[] array = catalogo.getListaVehiculos();
//        array[0].setBastidor("123A");
//        
//        System.out.println("-----------------------------------");
//        catalogo.mostrarCatalogo();
//        
//        v.setBastidor("123A");
//        System.out.println(v);
//        int pos = catalogo.buscarVehiculo(v);
//        System.out.println("posición " + pos);
//        catalogo.mostrarCatalogo();
