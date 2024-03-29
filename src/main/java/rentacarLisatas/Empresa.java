/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarLisatas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * RegistrarCliente registraVehiculo buscarCliente BuscarVehiculos
 * registrarAlquiler(fecha, nºdescripción) recibirVehiculos(Alquiler a)
 *
 * @author eduardo
 */
public class Empresa {

    private String cif;
    private String nombre;
    private CatalogosVehiculos catalogoVehiculo;
    private CatalogoCliente catalogoCliente;
    private CatalogoAlquiler catalogoAlquiler;

    public Empresa(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
        this.catalogoCliente = new CatalogoCliente(0);
        this.catalogoVehiculo = new CatalogosVehiculos(0);
        this.catalogoAlquiler = new CatalogoAlquiler(0);
    }

    public Empresa() {
    }

//    public CatalogoAlquiler alquilerCliente(String nif) {
//
//        return this.catalogoAlquiler.buscarAlquilerCliente(nif);
//    }
//
//    public Cliente buscarCliente(String nif) {
//        return this.catalogoCliente.buscarCliente(nif);
//    }
//
//    public void registrarVehiculo(Vehiculos v) {
//        this.catalogoVehiculo.anadirVehiculo(v);
//    }
//
//    public Vehiculos buscarVehiculo(String bastidor) {
//        return this.catalogoVehiculo.buscarVehiculos(bastidor);
//    }
//
//    public boolean registrarAlquiler(String nif, String bastidor, LocalDate fechainicio, int dias) {
//        Cliente auxCli = this.catalogoCliente.buscarCliente(nif);
//        Vehiculos auxVe = this.catalogoVehiculo.buscarVehiculos(bastidor);
//        if (auxCli != null && auxVe != null && auxVe.isDisponible() == true) {
//            this.catalogoAlquiler.anadirAlquiler(new Alquileres(auxCli, auxVe, fechainicio, dias));
//            auxVe.setDisponible(false);
//            return true;
//        }
//        return false;
//    }
//
//    public void recibirVehiculos(Alquileres a) {
//
//        if (this.catalogoAlquiler.buscarAlquiler(a.getArquileID()) != null) {
//            a.getVehiculo().setDisponible(true);
//        }
//    }
//EJERCICIO 5C

    public ArrayList buscarAlquilerCliente(String nif) {

        ArrayList<Alquileres> clienteNif = new ArrayList();

        for (int i = 0; i < this.catalogoAlquiler.getLista().size(); i++) {

            if (this.catalogoAlquiler.lista.get(i).getCliente().getNif().equals(nif)) {
                clienteNif.add(catalogoAlquiler.getLista().get(i));
            }
        }
        return clienteNif;
    }

    public ArrayList buscarAlquilerVehiculo(String bastidor) {

        ArrayList<Alquileres> vehiculoBastidor = new ArrayList();

        for (int i = 0; i < this.catalogoVehiculo.getLista().size(); i++) {

            if (this.catalogoAlquiler.lista.equals(this.catalogoVehiculo.buscarVehiculos(bastidor))) {
                vehiculoBastidor.add(catalogoAlquiler.getLista().get(i));
            }
        }
        return vehiculoBastidor;
    }

    public void borrarAlquilerPorID(int AlquilerID) {
         Alquileres aux = this.catalogoAlquiler.buscarAlquiler(AlquilerID);
       if (aux != null){
           this.catalogoAlquiler.borrarElemento(aux);
       }
    }

    public void borrarCliente(Cliente c) {
        this.catalogoAlquiler.getLista().remove(c);
    }

    public void borrarVehiculo(Vehiculos v) {
        this.catalogoAlquiler.getLista().remove(v);
    }

    public ArrayList obtenerVehiculos(LocalDate fecha) {

        ArrayList<Vehiculos> v = new ArrayList();
//        for (int i = 0; i < this.catalogoAlquiler.; i++) {
//            
//        }
        for (Alquileres a : this.catalogoAlquiler.lista) {
            if (a.getFechaInicio().equals(fecha)) {
                v.add(a.getVehiculo());

            }
        }
        return v;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CatalogosVehiculos getCatalogoVehiculo() {
        return catalogoVehiculo;
    }

    public void setCatalogoVehiculo(CatalogosVehiculos catalogoVehiculo) {
        this.catalogoVehiculo = catalogoVehiculo;
    }

    public CatalogoCliente getCatalogoCliente() {
        return catalogoCliente;
    }

    public void setCatalogoCliente(CatalogoCliente catalogoCliente) {
        this.catalogoCliente = catalogoCliente;
    }

    public CatalogoAlquiler getCatalogoAlquiler() {
        return catalogoAlquiler;
    }

    public void setCatalogoAlquiler(CatalogoAlquiler catalogoAlquiler) {
        this.catalogoAlquiler = catalogoAlquiler;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa{");
        sb.append("cif=").append(cif);
        sb.append(", nombre=").append(nombre);
        sb.append(", catalogoVehiculo=").append(catalogoVehiculo);
        sb.append(", catalogoCliente=").append(catalogoCliente);
        sb.append(", catalogoAlquiler=").append(catalogoAlquiler);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.cif);
        hash = 41 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.cif, other.cif)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

}
