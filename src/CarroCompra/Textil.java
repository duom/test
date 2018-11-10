package CarroCompra;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Textil extends Producte{

    String composicioTextil;

    ResumenCompra resumenCompra = new ResumenCompra();
    Scanner scanner = new Scanner(System.in);

    ArrayList<Textil> textiles = new ArrayList<Textil>();


    public void crearTextil(String nombre, int precio, int codigoBarras){

        Textil textil = new Textil();
        textil.nom=nombre;
        textil.preu=precio;
        textil.codiBarras=codigoBarras;
        //textil.composicioTextil=composicion;

        textiles.add(textil);

    }

    public void añadirTextil(){

        System.out.println("Textil");
        System.out.println("Como se llama el producto textil que quieres incluir");
        String nombre=scanner.nextLine();
        System.out.println("Que precio tiene?");
        int precio=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Codigo barras?");
        int codigoBarras = scanner.nextInt();
        scanner.nextLine();

        crearTextil(nombre,precio,codigoBarras);
        resumenCompra.recibirTextil(textiles);

    }

    public void mostrarTextiles(){

        // SOLO ME MUESTRA EL ULTIMO Y QUIERO QUE LOS MUESTRE TODOS

        for (int i = 0; i < textiles.size(); i++) {

            System.out.println("Tienes en el carrito de textiles "+textiles.size()+" productos:");
            System.out.println(textiles.get(i).nom+" "+textiles.get(i).preu+"euros "+textiles.get(i).codiBarras+"\n");

        }

    }
}
