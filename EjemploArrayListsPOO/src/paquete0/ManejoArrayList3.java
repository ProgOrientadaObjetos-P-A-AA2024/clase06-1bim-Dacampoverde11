/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete0;

import java.util.ArrayList;
import paquete2.Calificacion;
import paquete2.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {
    public static void main(String[] args) {
        
        Calificacion c1 = new Calificacion(10, "Base de Datos");
        Calificacion c2 = new Calificacion(9, "Matemáticas");
        Calificacion c3 = new Calificacion(7, "Lógica");
        
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        Profesor prof3 = new Profesor("Norman Muñoz", "contrato");
        
        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);
        c3.establecerProfesor(prof3);
        
        
        // ArrayList
        ArrayList <Calificacion> calificaciones = new ArrayList<>();
        calificaciones.add(c1);
        calificaciones.add(c2);
        calificaciones.add(c3);
        
        for (int i = 0; i < calificaciones.size(); i++) {
            System.out.printf("%s - %s - %.2f\n", 
                    calificaciones.get(i).obtenerProfesor().obtenerNombre(), 
                    calificaciones.get(i).obtenerNombreMateria(),
                    calificaciones.get(i).obtenerNota());
        }
        
        
    }
}
