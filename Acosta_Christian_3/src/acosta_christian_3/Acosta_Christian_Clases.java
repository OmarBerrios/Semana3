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
public class Acosta_Christian_Clases {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fecha;
        String dia = "";
        int diadelMes = 0, mes = 0;
        boolean fechaValida = false;
        while (!fechaValida) {
            System.out.println("Ingrese la fecha actual en el formato 'día, DD/MM':");
            fecha = scanner.nextLine();
            String[] partes = fecha.split(", ");
            if (partes.length == 2) {
                dia = partes[0].toLowerCase();
                String[] fechaPartes = partes[1].split("/");

                if (fechaPartes.length == 2) {
                    try {
                        diadelMes = Integer.parseInt(fechaPartes[0]);
                        mes = Integer.parseInt(fechaPartes[1]);
                        if ((mes >= 1 && mes <= 12) && (diadelMes >= 1 && diadelMes <= 31)) {
                            if (!(mes == 2 && diadelMes > 28) && !(mes == 4 || mes == 6 || mes == 9 || mes == 11 && diadelMes > 30)) {
                                fechaValida = true;
                            } else {
                                System.out.println("Error: Dia o mes fuera de rango.");
                            }
                        } else {
                            System.out.println("Error: Dia o mes fuera de rango.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Dia o mes deben ser numeros.");
                    }
                } else {
                    System.out.println("Error: Formato de fecha incorrecto.");
                }
            } else {
                System.out.println("Error: Formato de fecha incorrecto.");
            }
        }
        if (dia.equals("Lunes")) {
            System.out.println("Se tomaron examenes en el nivel Inicial? (s/n)");
            String respuesta = scanner.nextLine().toLowerCase();
            if (respuesta.equals("s")) {
                System.out.print("Ingrese cuantos alumnos aprobaron: ");
                int Aprobados = scanner.nextInt();
                System.out.print("Ingrese cuantos alumnos no aprobaron: ");
                int noAprobados = scanner.nextInt();
                int Alumnos = Aprobados + noAprobados;

                if (Alumnos > 0) {
                    double Aprobados_2 = (double) Aprobados / Alumnos * 100;
                    System.out.printf("Porcentaje de aprobados:"+ Aprobados_2);
                } else {
                    System.out.println("No hubo alumnos para evaluar ");
                }
                scanner.nextLine();
            }
        } else if (dia.equals("Martes")) {
            System.out.println("Se tomaron examenes en el nivel Intermedio? (s/n)");
            String respuesta = scanner.nextLine().toLowerCase();
            if (respuesta.equals("s")) {
                System.out.print("Ingrese cuantos alumnos aprobaron: ");
                int Aprobados = scanner.nextInt();
                System.out.print("Ingrese cuantos alumnos no aprobaron: ");
                int noAprobados = scanner.nextInt();
                int Alumnos = Aprobados + noAprobados;

                if (Alumnos > 0) {
                    double Aprobados_2 = (double) Aprobados / Alumnos * 100;
                    System.out.printf("Porcentaje de aprobados: "+ Aprobados_2);
                } else {
                    System.out.println("No hubo alumnos para evaluar.");
                }
                scanner.nextLine();
            }
        } else if (dia.equals("Miercoles")) {
            System.out.println("Se tomaron examenes en el nivel Avanzado? (s/n)");
            String respuesta = scanner.nextLine().toLowerCase();
            if (respuesta.equals("s")) {
                System.out.print("Ingrese cuantos alumnos aprobaron: ");
                int Aprobados = scanner.nextInt();
                System.out.print("Ingrese cuantos alumnos no aprobaron: ");
                int noAprobados = scanner.nextInt();
                int Alumnos = Aprobados + noAprobados;

                if (Alumnos > 0) {
                    double Aprobados_2 = (double) Aprobados / Alumnos * 100;
                    System.out.printf("Porcentaje de aprobados:" + Aprobados_2);
                } else {
                    System.out.println("No hubo alumnos para evaluar.");
                }
                scanner.nextLine();
            }
        } else if (dia.equals("Jueves")) {
            System.out.println("Ingrese el porcentaje de asistencia a clase:");
            double asistencia = scanner.nextDouble();
            if (asistencia > 50) {
                System.out.println("Asistio la mayoria.");
            } else {
                System.out.println("No asistio la mayoria.");
            }
            scanner.nextLine();
        } else if (dia.equals("Viernes")) {
            if (diadelMes == 1 && (mes == 1 || mes == 7)) {
                System.out.println("Ingrese la cantidad de alumnos del nuevo ciclo: ");
                int Alumnos_2 = scanner.nextInt();
                System.out.println("Ingrese el precio por cada alumno: ");
                double precio = scanner.nextDouble();
                double Total = Alumnos_2 * precio;
                System.out.printf("Ingreso total: " + Total);

            }
        } else {
            System.out.println("Error: Dia de la semana no sirve ");
        }

        scanner.close();
    }
}
