package CarroCompra;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Alimentacio extends Producte {

    Scanner scanner = new Scanner(System.in);



    Date dataCaducitat;
    //LocalDate.now();
    //preu - preu*(1/(dataCaducitat-dataActual+1)) + (preu * 0.1)

    public void crearComestible(String nombre, double precio, int codigoBarras, ResumenCompra resumenCompra){

        Alimentacio comestible = new Alimentacio();
        comestible.nom=nombre;
        comestible.preu=precio;
        comestible.codiBarras=codigoBarras;
        //comestible.dataCaducitat=caducidad;

        resumenCompra.recibirAlimentacion().add(comestible);

    }

    public void añadirComestible(ResumenCompra resumenCompra){

        System.out.println("Alimentacio");
        System.out.println("Como se llama el producto de alimentación que quieres incluir");
        String nombre=scanner.nextLine();
        System.out.println("Que precio tiene?");
        double precio=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Codigo barras?");
        int codigoBarras = scanner.nextInt();
        scanner.nextLine();

        crearComestible(nombre,precio,codigoBarras, resumenCompra);
        mostrarComestibles(resumenCompra);

    }

    public void mostrarComestibles(ResumenCompra resumenCompra){

        // SOLO ME MUESTRA EL ULTIMO Y QUIERO QUE LOS MUESTRE TODOS
        System.out.println("Tienes en el carrito de comestibles "+ resumenCompra.recibirAlimentacion().size()+" productos:");
        for (int i = 0; i <  resumenCompra.recibirAlimentacion().size(); i++) {

            System.out.println( resumenCompra.recibirAlimentacion().get(i).nom+" "+ resumenCompra.recibirAlimentacion().get(i).preu+"euros "+ resumenCompra.recibirAlimentacion().get(i).codiBarras+"\n");

        }

    }

}
