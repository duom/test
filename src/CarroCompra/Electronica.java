package CarroCompra;

import java.util.ArrayList;
import java.util.Scanner;

public class Electronica extends Producte{

    int diesGarantia;
    //preu + preu*(diesGarantia/365)*0.1
    ResumenCompra resumenCompra = new ResumenCompra();
    Scanner scanner = new Scanner(System.in);

    ArrayList<Electronica> electronicas = new ArrayList<Electronica>();


    public void crearElectronica(String nombre, int precio, int codigoBarras){

        Electronica electronica = new Electronica();
        electronica.nom=nombre;
        electronica.preu=precio;
        electronica.codiBarras=codigoBarras;
        //textil.composicioTextil=composicion;

        electronicas.add(electronica);

    }

    public void añadirElectronica(){

        System.out.println("Textil");
        System.out.println("Como se llama el producto textil que quieres incluir");
        String nombre=scanner.nextLine();
        System.out.println("Que precio tiene?");
        int precio=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Codigo barras?");
        int codigoBarras = scanner.nextInt();
        scanner.nextLine();

        crearElectronica(nombre,precio,codigoBarras);
        resumenCompra.recibirElectronica(electronicas);

    }

    public void mostrarElectronicas(){

        // SOLO ME MUESTRA EL ULTIMO Y QUIERO QUE LOS MUESTRE TODOS

        for (int i = 0; i < electronicas.size(); i++) {

            System.out.println("Tienes en el carrito de electronica"+electronicas.size()+" productos:");
            System.out.println(electronicas.get(i).nom+" "+electronicas.get(i).preu+"euros "+electronicas.get(i).codiBarras+"\n");

        }

    }

}
