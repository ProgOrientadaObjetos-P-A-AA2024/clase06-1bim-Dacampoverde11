/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Venta {

    private double valorVenta;
    private ArrayList<Computador> computadoras;

    public Venta(ArrayList<Computador> c) {
        computadoras = c;

    }
    
    public double obtenerValorVenta(){
        return  valorVenta;
    }
        
    
    public void establecerValorVenta(){
        double suma = 0;
        for(int c = 0; c < computadoras.size(); c++){
            suma += computadoras.get(c).obtenerCostoComputador();
        }
        
        valorVenta = suma;
    }
    
    public ArrayList<Computador> obtenerComputadoras(){
        return computadoras;
    }
    
    @Override
    
    public String toString(){
        String cadena = "" ;
         for (int c = 0; c < computadoras.size(); c++){
             cadena = String.format("%sProcesador: %s\n"
                     + "Costo Procesador: %s\n"
                     + "Memoria: %s\n"
                     + "Costo Memoria: %s\n"
                     + "Costo del Computador: %s\n",cadena,
                     obtenerComputadoras().get(c).obtenerProcesador().obtenerMarca(),
                     obtenerComputadoras().get(c).obtenerProcesador().obtenerCosto(),
                     obtenerComputadoras().get(c).obtenerMemoria().obtenerMarca(),
                     obtenerComputadoras().get(c).obtenerMemoria().obtenerCosto(),
                     obtenerComputadoras().get(c).obtenerCostoComputador());
         }
         cadena = String.format("%sValor final de la Venta: %.2f\n", cadena
         , obtenerValorVenta());
        
       
        
        return cadena;
    }

}
