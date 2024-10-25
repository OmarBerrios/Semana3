/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acosta_christian_3;

import java.util.Scanner;

public class Acosta_Christian_Cadena {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese sus caracteres: ");
        String cadena = scanner.nextLine();
        char maxCaracter = ' ';
        int maxCount = 0;
        int[] caracteres = new int[1000];
        int i = 0;
        while (i < cadena.length()) {
            char caracter = cadena.charAt(i);
        caracteres[caracter]++;
            if (caracteres[caracter] > maxCount) {
                maxCaracter = caracter;
                maxCount = caracteres[caracter];
            }
            
            i++;
        }
        
        System.out.println("El caracter que más se ha ingresado es: " + maxCaracter);
        System.out.println("La cantidad que este carácter se utilizó es: " + maxCount);
        
    }
}
