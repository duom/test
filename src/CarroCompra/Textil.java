package CarroCompra;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Textil extends Producte{

    String composicioTextil;

    ResumenCompra resumenCompra = new ResumenCompra();
    Scanner scanner = new Scanner(System.in);

    ArrayList<Textil> textiles = new ArrayList<Textil>();


    public void crearTextil(String nombre, double precio, int codigoBarras, ResumenCompra resumenCompra){

        Textil textil = new Textil();
        textil.nom=nombre;
        textil.preu=precio;
        textil.codiBarras=codigoBarras;
        //textil.composicioTextil=composicion;

        resumenCompra.recibirTextil().add(textil);

    }

    public void añadirTextil(ResumenCompra resumenCompra){

        System.out.println("Textil");
        System.out.println("Como se llama el producto textil que quieres incluir");
        String nombre=scanner.nextLine();
        System.out.println("Que precio tiene?");
        double precio=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Codigo barras?");
        int codigoBarras = scanner.nextInt();
        scanner.nextLine();

        crearTextil(nombre,precio,codigoBarras, resumenCompra);


    }

    public void mostrarTextiles(ResumenCompra resumenCompra){

        System.out.println("Tienes en el carrito de textiles "+ resumenCompra.recibirTextil().size()+" productos:");

        for (int i = 0; i < resumenCompra.recibirTextil().size(); i++) {

            System.out.println( resumenCompra.recibirTextil().get(i).nom+" "+ resumenCompra.recibirTextil().get(i).preu+"euros "+ resumenCompra.recibirTextil().get(i).codiBarras+"\n");

        }

    }
}
