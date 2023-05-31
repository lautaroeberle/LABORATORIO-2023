package EmpresaVehiculos;

import Fecha.Fecha;

public class Camion extends Vehiculo{

    public String patente;

    public int capacidadcarga;

    public int cargaactual;

    public Camion() {
        super();
        this.patente = patente;
        this.capacidadcarga = capacidadcarga;
        this.cargaactual = cargaactual;
    }

    public Camion(String marca, String modelo, String color, int cantidadDeRuedas, Fecha fechafabricacion, String patente, int capacidadcarga, int cargaactual) {
        super(marca, modelo, color, cantidadDeRuedas, fechafabricacion);
        this.patente = patente;
        this.capacidadcarga = capacidadcarga;
        this.cargaactual = cargaactual;
    }

    public int getCargaactual() {
        return cargaactual;
    }

    public void setCargaactual(int cargaactual) {
        this.cargaactual = cargaactual;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getcapacidadcarga() {
        return capacidadcarga;
    }

    public void setcapacidadcarga(int capacidadcarga) {
        this.capacidadcarga= capacidadcarga;
    }
}