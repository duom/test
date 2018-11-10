package CarroCompra;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Alimentacio extends Producte {

    Scanner scanner = new Scanner(System.in);
    ResumenCompra resumenCompra = new ResumenCompra();

    ArrayList<Alimentacio> comestibles = new ArrayList<Alimentacio>();

    Date dataCaducitat;
    //LocalDate.now();
    //preu - preu*(1/(dataCaducitat-dataActual+1)) + (preu * 0.1)

    public void crearComestible(String nombre, int precio, int codigoBarras){

        Alimentacio comestible = new Alimentacio();
        comestible.nom=nombre;
        comestible.preu=precio;
        comestible.codiBarras=codigoBarras;
        //comestible.dataCaducitat=caducidad;

        comestibles.add(comestible);

    }

    public void añadirComestible(){

        System.out.println("Alimentacio");
        System.out.println("Como se llama el producto de alimentación que quieres incluir");
        String nombre=scanner.nextLine();
        System.out.println("Que precio tiene?");
        int precio=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Codigo barras?");
        int codigoBarras = scanner.nextInt();
        scanner.nextLine();

        crearComestible(nombre,precio,codigoBarras);

        resumenCompra.recibirAlimentacion(comestibles);


    }

    public void mostrarComestibles(){

        // SOLO ME MUESTRA EL ULTIMO Y QUIERO QUE LOS MUESTRE TODOS

        for (int i = 0; i < comestibles.size(); i++) {

            System.out.println("Tienes en el carrito de comestibles "+comestibles.size()+" productos:");
            System.out.println(comestibles.get(i).nom+" "+comestibles.get(i).preu+"euros "+comestibles.get(i).codiBarras+"\n");

        }

    }

}
