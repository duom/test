package CarroCompra;

import java.util.ArrayList;
import java.util.Date;


public class ResumenCompra {

    Date objDate = new Date();

    private ArrayList<Alimentacio> totalAlimentacion = new ArrayList<>();
    private ArrayList<Textil> totalTextil = new ArrayList<>();
    private ArrayList<Electronica> totalElectronica = new ArrayList<>();


    public ArrayList<Alimentacio> recibirAlimentacion(){
        return totalAlimentacion;
    }

    public ArrayList<Textil> recibirTextil(){
        return totalTextil;
    }

    public ArrayList<Electronica> recibirElectronica(){
        return totalElectronica;
    }

    public void mostrarTiket(){

        int total=0;
        int totalAlimento=0;
        int totalTextil=0;
        int totalElectrodomestico=0;



        System.out.println("++++TIQUET SUPERCOR++++++");
        System.out.println(objDate.toString());
        System.out.println("\n");

        for (int i = 0; i < recibirAlimentacion().size() ; i++) {
            System.out.println("ALIMENTO: "+ recibirAlimentacion().get(i).nom+" PRECIO: "+recibirAlimentacion().get(i).preu);
            totalAlimento = (int) (totalAlimento + recibirAlimentacion().get(i).preu);

        }
        for (int i = 0; i < recibirTextil().size() ; i++) {
            System.out.println("PRENDA : "+ recibirTextil().get(i).nom+" PRECIO: "+recibirTextil().get(i).preu);
            totalTextil = (int) (totalTextil + recibirTextil().get(i).preu);
        }
        for (int i = 0; i < recibirElectronica().size() ; i++) {
            System.out.println("ELECTRODOMESTICO: "+ recibirElectronica().get(i).nom+" PRECIO: "+recibirElectronica().get(i).preu);
            totalElectrodomestico = (int) (totalElectrodomestico + recibirElectronica().get(i).preu);
        }
        total=totalAlimento+totalTextil+totalElectrodomestico;
        System.out.println("TOTAL A PAGAR: ");
        System.out.println(total+"\n");

        System.out.println("HASTA PRONT0");

        //ASI ELIMINO TODOS LOS DATOS DE LOS ARRAYS

        recibirAlimentacion().clear();
        recibirTextil().clear();
        recibirElectronica().clear();

    }

    public void mostrarCarrito(){


        for (int i = 0; i < totalAlimentacion.size() ; i++) {
            System.out.println(totalAlimentacion.get(i).nom);
            System.out.println(totalAlimentacion.get(i).preu);

        }
        for (int i = 0; i < totalTextil.size() ; i++) {
            System.out.println(totalTextil.get(i).nom);
            System.out.println(totalTextil.get(i).preu);

        }
        for (int i = 0; i < totalElectronica.size() ; i++) {
            System.out.println(totalElectronica.get(i).nom);
            System.out.println(totalElectronica.get(i).preu);

        }

        }


    }


