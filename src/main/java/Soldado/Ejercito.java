/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soldado;


import java.util.Set;

/**
 *
 * @author eduardo
 */
public class Ejercito {
    
    private Set<Soldado> numSoldadosN; 

    public Ejercito(Set<Soldado> numSoldadosN) {
        this.numSoldadosN = numSoldadosN;
    }

    public Set getNumSoldadosN() {
        return numSoldadosN;
    }

    public void setNumSoldadosN(Set numSoldadosN) {
        this.numSoldadosN = numSoldadosN;
    }

    @Override
    public String toString() {
        return "Ejercito{" + "numSoldadosN=" + numSoldadosN + '}';
    }
    
    public void saberNumSoldados(){
        int soldats = this.numSoldadosN.size();
    }
    
    public void alistarSoldado(Soldado s){
        this.numSoldadosN.add(s);
    }
    
    public boolean saberSoldadosTieneEjercito(){
        
        return this.numSoldadosN.contains(0)? true : false;
    }
    
    public boolean saberSoldadoEstaEjercito(Soldado s){
        return
    }
}
