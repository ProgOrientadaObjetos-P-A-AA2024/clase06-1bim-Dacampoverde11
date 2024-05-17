/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Computador {
   private String marca;
   private Procesador procesador;
   private Memoria memoria;
   private double costoComputador;
   
   public Computador (String marc, Procesador p, Memoria m){
       marca = marc;
       procesador = p;
       memoria = m;
       
   }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerMarca(String marca) {
        this.marca = marca;
    }

    public Procesador obtenerProcesador() {
        return procesador;
    }

    public void establecerProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public Memoria obtenerMemoria() {
        return memoria;
    }

    public void establecerMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public double obtenerCostoComputador() {
        return costoComputador;
    }

    public void establecerCostoComputador() {
        costoComputador = obtenerProcesador().obtenerCosto()
                + obtenerMemoria().obtenerCosto();
    }

    
    
    
   
   
}
