package Personas;

import Fecha.Fecha;

import java.util.ArrayList;

public class Profesor extends Persona{

    int porcentajedescuento;

    public int getPorcentajedescuento() {
        return porcentajedescuento;
    }

    public void setPorcentajedescuento(int porcentajedescuento) {
        this.porcentajedescuento = porcentajedescuento;
    }

    public Profesor(){
        super();
        porcentajedescuento = 20;
    }
    public Profesor(String nombre, Fecha nacimiento,int porcentajedescuento) {
        super(nombre,nacimiento);
        this.porcentajedescuento = porcentajedescuento;
    }

}