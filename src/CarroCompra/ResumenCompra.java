package CarroCompra;

import java.util.ArrayList;
import java.util.Date;


public class ResumenCompra {

    Date objDate = new Date();

    ArrayList<ArrayList<Alimentacio>> totalAlimentacion = new ArrayList<>();
    ArrayList<ArrayList<Textil>> totalTextil = new ArrayList<>();
    ArrayList<ArrayList<Electronica>> totalElectronica = new ArrayList<>();


    public void recibirAlimentacion(ArrayList<Alimentacio> arrayAlimentacion){

        totalAlimentacion.add(arrayAlimentacion);
    }

    public void recibirTextil(ArrayList<Textil> arrayTextil){
        totalTextil.add(arrayTextil);
    }

    public void recibirElectronica(ArrayList<Electronica> arrayElectronica){
        totalElectronica.add(arrayElectronica);
    }

    public void mostrarTiket(){

        System.out.println("++++TIQUET SUPERCOR++++++");
        System.out.println(objDate.toString());

        for (int i = 0; i < totalAlimentacion.size() ; i++) {
            System.out.println(totalAlimentacion.get(i));

        }
        for (int i = 0; i < totalTextil.size() ; i++) {
            System.out.println(totalTextil.get(i));

        }
        for (int i = 0; i < totalElectronica.size() ; i++) {
            System.out.println(totalElectronica.get(i));

        }


        System.out.println("HASTA PRONT0");


        //ASI ELIMINO TODOS LOS DATOS DE LOS ARRAYS
        totalElectronica.clear();
        totalTextil.clear();
        totalAlimentacion.clear();


    }

    public void mostrarCarrito(){


        if(totalElectronica==null&&totalTextil==null&&totalAlimentacion==null){
            System.out.println("Carrito vacio");

        }

        System.out.println("Aqui tiene los articulos que tiene en el carrito");

    }

}
