/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Memoria {
    private String marca;
    private double costo;
    
    public Memoria (String m, double c){
        marca = m;
        costo = c;
    
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerMarca(String marca) {
        this.marca = marca;
    }

    public double obetenerCosto() {
        return costo;
    }

    public void establecerCosto(double costo) {
        this.costo = costo;
    }
    
    
}
