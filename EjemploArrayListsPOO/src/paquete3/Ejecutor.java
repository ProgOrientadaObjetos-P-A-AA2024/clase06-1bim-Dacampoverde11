/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String marcaProcesador;
        String marcaMemoria;
        double costoProcesador;
        double costoMemoria;
        int numComputadoras;
        Procesador procesador;
        Memoria memoria;
        ArrayList<Computador> computadores = new ArrayList<>();
        

        System.out.println("Ingrese el numero de computadoras a ingresar: ");
        numComputadoras = sc.nextInt();
        sc.nextLine();

        for (int c = 0; c < numComputadoras; c++) {
            System.out.println("Ingrese la marca del procesador: ");
            marcaProcesador = sc.nextLine();

            System.out.println("Ingrese el costo del procesador: ");
            costoProcesador = sc.nextDouble();
            sc.nextLine();

            System.out.println("Ingrese la marca de la memoria");
            marcaMemoria = sc.nextLine();

            System.out.println("Ingrese el costo de la memoria: ");
            costoMemoria = sc.nextDouble();
            sc.nextLine();
            
            memoria = new Memoria (marcaMemoria, costoMemoria);
            procesador = new Procesador (marcaProcesador, costoProcesador);
            Computador computador = new Computador (marcaProcesador,
                    procesador,memoria);
            computador.establecerCostoComputador();
            computadores.add(computador);

        }
        
        Venta v = new Venta (computadores);
        v.establecerValorVenta();
        System.out.println("////////////////////////////////////////////////////");
        System.out.printf("%s\n",v);
        

    }

}
