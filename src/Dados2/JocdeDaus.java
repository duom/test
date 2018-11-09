package Dados2;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class JocdeDaus {

    int intentos=1;
    int valor;
    int victorias=0;
    int derrotas=0;

    Scanner scanner = new Scanner(System.in);


    public void constructor(){

        Dau d1 = new Dau();
        Dau d2 = new Dau();
        Dau d3 = new Dau();

        int restultado1= (int) (Math.random()*6)+1;
        int restultado2= (int) (Math.random()*6)+1;
        int restultado3= (int) (Math.random()*6)+1;

        if(restultado1==restultado2&&restultado1==restultado3){
            victorias++;

        }else{
            derrotas++;
        }

        d1.setValor(restultado1);
        d2.setValor(restultado2);
        d3.setValor(restultado3);

        System.out.println("Dado 1 = "+ restultado1);
        System.out.println("Dado 2 = "+ restultado2);
        System.out.println("Dado 3 = "+ restultado3);

        System.out.println("Se han jugado "+ intentos +" partidas");

        d1.imprimir(victorias,derrotas);
    }

    public void jugar(){

        int opcion=0;

        System.out.println("******Juego de 3 dados *******");

        while(opcion != 2){

            System.out.println("1)Tirar 2)Salir ");
            opcion=scanner.nextInt();scanner.nextLine();;

            switch (opcion){

                case 1: constructor();intentos++;
                break;

                case 2:
                System.out.println("Has ganado "+ victorias+" y has hecho "+ intentos+" intentos");
                System.out.println("Ciao");

                break;
            }

        }

        System.out.println("Hasta luego");

    }


}
