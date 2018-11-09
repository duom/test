package com.company.Dados1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("*****Frequencia Dados******* ");
        Scanner scanner = new Scanner(System.in);

        int opcion=0;

        System.out.println("1)Tirar \n" + "2)Resumen \n" + "3)Salir");


        while (opcion != 3) {

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    tirarDados();
                    System.out.println("1)Tirar 2)Resumen 3)Salir");
                    opcion = scanner.nextInt();
                    scanner.nextLine();

                case 2:
                    System.out.println("Mostrar victorias");
                    System.out.println("1)Tirar 2)Resumen 3)Salir");
                    opcion = scanner.nextInt();
                    scanner.nextLine();
            }
            break;
        }
        System.out.println("Hasta la proxima");
    }

    public static void tirarDados() {
        Random r1 = new Random();
        Random r2 = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas veces quieres tirarlos?");
        int tiros = scanner.nextInt();
        scanner.nextLine();
        int total = 0;
        int contador[] = new int[13];

        for (int i = 0; i < tiros; i++) {

            int resultadoUno = r1.nextInt(6) + 1;
            int resultadoDos = r2.nextInt(6) + 1;

            total = resultadoUno + resultadoDos;

            if (total == 2) { contador[2]++; }
            if (total == 3) { contador[3]++; }
            if (total == 4) { contador[4]++; }
            if (total == 5) { contador[5]++; }
            if (total == 6) { contador[6]++; }
            if (total == 7) { contador[7]++; }
            if (total == 8) { contador[8]++; }
            if (total == 9) { contador[9]++; }
            if (total == 10) { contador[10]++; }
            if (total == 11) { contador[11]++; }
            if (total == 12) { contador[12]++; }
            total = 0;
        }
        for (int i = 2; i < 13; i++) {
            System.out.println("El numero " + i + " ha salido " + contador[i] + " veces");

        }


    }
}

