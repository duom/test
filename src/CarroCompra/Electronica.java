package CarroCompra;

import java.util.ArrayList;
import java.util.Scanner;

public class Electronica extends Producte{

    int diesGarantia;
    //preu + preu*(diesGarantia/365)*0.1
    ResumenCompra resumenCompra = new ResumenCompra();
    Scanner scanner = new Scanner(System.in);

    ArrayList<Electronica> electronicas = new ArrayList<Electronica>();


    public void crearElectronica(String nombre, double precio, int codigoBarras, ResumenCompra resumenCompra){

        Electronica electronica = new Electronica();
        electronica.nom=nombre;
        electronica.preu=precio;
        electronica.codiBarras=codigoBarras;
        //textil.composicioTextil=composicion;

        resumenCompra.recibirElectronica().add(electronica);

    }

    public void añadirElectronica(ResumenCompra resumenCompra){

        System.out.println("Electronica");
        System.out.println("Como se llama el producto de electronica que quieres incluir");
        String nombre=scanner.nextLine();
        System.out.println("Que precio tiene?");
        double precio=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Codigo barras?");
        int codigoBarras = scanner.nextInt();
        scanner.nextLine();

        crearElectronica(nombre,precio,codigoBarras, resumenCompra);


    }

    public void mostrarElectronicas(ResumenCompra resumenCompra){

        System.out.println("Tienes en el carrito de electronica "+ resumenCompra.recibirElectronica().size()+" productos:");

        for (int i = 0; i < resumenCompra.recibirElectronica().size(); i++) {

            System.out.println( resumenCompra.recibirElectronica().get(i).nom+" "+ resumenCompra.recibirElectronica().get(i).preu+"euros "+ resumenCompra.recibirElectronica().get(i).codiBarras+"\n");

        }

    }

}
