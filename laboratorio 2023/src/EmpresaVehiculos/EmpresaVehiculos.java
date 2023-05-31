package EmpresaVehiculos;

import java.util.ArrayList;


public class EmpresaVehiculos {

    public ArrayList<Vehiculo> vehiculo;


    public EmpresaVehiculos() {
        this.vehiculo = new ArrayList<Vehiculo>();
    }

    public void agregarAuto(Auto auto1){

        vehiculo.add(auto1);

    }
    public void agregarCamion(Camion camion1){

        vehiculo.add(camion1);

    }
    public void agregarBici(Bicicleta bici1){

        vehiculo.add(bici1);

    }
    public void cantidadmasalta(){


    }

    public void porcentajeDeAutosDescapotables(){
        int contadorautos = 0;
        int contadorautosdescapotables = 0;
        int porcentaje = 0;
        for ( Vehiculo i: vehiculo){
            if ( i instanceof Auto == true) {
                contadorautos++;
                if ( ((Auto) i).isDescapotable() ){
                    contadorautosdescapotables++;
                }
            }
        }
        porcentaje =( contadorautosdescapotables * 100)  / contadorautos  ;

        System.out.println("El porcentaje de autos descapotables es de: " + porcentaje + "%. ");

    }

    public void agregarcargacamioneta(int cargaagregar){
        int capacidadcamion = 0;
        for (  Vehiculo i : vehiculo){
            if ( i instanceof Camion == true){
                if ( ((cargaagregar + ((Camion) i).cargaactual  ) > ( ((Camion) i).getcapacidadcarga())) ){
                    System.out.println("La carga agregada supera la capacidad maxima. " + ((Camion) i).getcapacidadcarga() + " Es lo maximo permitido. ");
                }
                else {
                    capacidadcamion = ((Camion) i).getcapacidadcarga() ;
                    capacidadcamion = cargaagregar + ((Camion) i).cargaactual;
                    System.out.println("La nueva carga de la camioneta es: " + capacidadcamion );
                }
            }
        }
    }

    public void mascantiad(){
        int contadorauto = 0;
        int contadorcamion = 0;
        int contadorbici = 0;

        for (Vehiculo i : vehiculo){
            if ( i instanceof Auto == true){
                contadorauto++;
            }
            if ( i instanceof Camion == true){
                contadorcamion++;
            }
            else{
                contadorbici++;
            }
        }

        System.out.println("La cantidad de Autos es " + contadorauto);
        System.out.println("La cantidad de Camionetas es " + contadorcamion);
        System.out.println("La cantidad de Bicicletas es " + contadorbici);

    }
}