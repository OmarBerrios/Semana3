/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acosta_christian_3;

import java.util.Scanner;


/**
 *
 * @author omarr
 */
public class Acosta_Christian_Notas {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Totales;
        System.out.print("Ingrese todas sus notas: ");
        do {
            Totales = scanner.nextInt();
            } while (Totales <= 4);
        double[] notas = new double[Totales];
        double suma = 0;
        double notaMax = Double.MIN_VALUE;
        double notaMin = Double.MAX_VALUE;
        for (int i = 0; i < Totales; i++) {
            double nota;
            do {
                System.out.print("Nota #" + (i + 1) + ": ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 100) {
                    System.out.println("La nota debe estar entre 0 y 100.");
                }
            } while (nota < 0 || nota > 100);

            notas[i] = nota;
            suma += nota;

            if (nota > notaMax) {
                notaMax = nota;
            }
            if (nota < notaMin) {
                notaMin = nota;
            }
        }
        double promedio = suma / Totales;
        System.out.printf("Promedio: %.2f %%\n", promedio);
        System.out.printf("Nota mayor: %.2f\n", notaMax);
        System.out.printf("Nota menor: %.2f\n", notaMin);
        scanner.close();
    }
}
    
   
   

