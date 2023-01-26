/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrdenacionBusqueda;

import java.util.Objects;

/**
 *
 * @author eduardo
 */
public class EquiposFútbol implements Comparable <EquiposFútbol>{

    private String nombre;
    private String colorEquipacion;
    private int titulos;
    private int jugadoresTotal;

    public EquiposFútbol(String nombre, String colorEquipacion, int titulos, int jugadoresTotal) {
        this.nombre = nombre;
        this.colorEquipacion = colorEquipacion;
        this.titulos = titulos;
        this.jugadoresTotal = jugadoresTotal;
    }

    public EquiposFútbol() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorEquipacion() {
        return colorEquipacion;
    }

    public void setColorEquipacion(String colorEquipacion) {
        this.colorEquipacion = colorEquipacion;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public int getJugadoresTotal() {
        return jugadoresTotal;
    }

    public void setJugadoresTotal(int jugadoresTotal) {
        this.jugadoresTotal = jugadoresTotal;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nombre);
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
        final EquiposFútbol other = (EquiposFútbol) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "EquiposF\u00fatbol{" + "nombre=" + nombre + ", colorEquipacion=" + colorEquipacion + ", titulos=" + titulos + ", jugadoresTotal=" + jugadoresTotal + '}';
    }

    @Override
    public int compareTo(EquiposFútbol o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

}
