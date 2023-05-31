package EmpresaVehiculos;

import Fecha.Fecha;

public class Auto extends Vehiculo {

    public String patente;

    public boolean descapotable;



    public Auto(String marca, String modelo, String color, int cantidadDeRuedas, Fecha fechafabricacion, String patente, boolean descapotable) {
        super(marca, modelo, color, cantidadDeRuedas, fechafabricacion);
        this.patente = patente;
        this.descapotable = descapotable;
    }

    public Auto(){
        super();
        this.patente = patente;
        this.descapotable = descapotable;

    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}
