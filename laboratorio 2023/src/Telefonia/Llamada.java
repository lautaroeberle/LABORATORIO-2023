package Telefonia;

import Fecha.Fecha;
import Personas.Empleado;

public class Llamada {


    Empleado empleadoOrigen;
    Empleado empleadoDestino;

    Fecha fechaLlamada;

    int duracionLlamada;

    boolean llamadaExterior;

    public boolean isLlamadaExterior() {
        return llamadaExterior;
    }

    public void setLlamadaExterior(boolean llamadaExterior) {
        this.llamadaExterior = llamadaExterior;
    }

    public Llamada(Empleado empleadoOrigen, Empleado empleadoDestino, Fecha fechaLlamada, int duracionLlamada,boolean llamadaExterior ) {
        this.empleadoOrigen = empleadoOrigen;
        this.empleadoDestino = empleadoDestino;
        this.fechaLlamada = fechaLlamada;
        this.duracionLlamada = duracionLlamada;
        this.llamadaExterior = llamadaExterior;

    }





    public Empleado getEmpleadoOrigen() {
        return empleadoOrigen;
    }

    public void setEmpleadoOrigen(Empleado empleadoOrigen) {
        this.empleadoOrigen = empleadoOrigen;
    }

    public Empleado getEmpleadoDestino() {
        return empleadoDestino;
    }

    public void setEmpleadoDestino(Empleado empleadoDestino) {
        this.empleadoDestino = empleadoDestino;
    }

    public Fecha getFechaLlamada() {
        return fechaLlamada;
    }

    public void setFechaLlamada(Fecha fechaLlamada) {
        this.fechaLlamada = fechaLlamada;
    }

    public int getDuracionLlamada() {
        return duracionLlamada;
    }

    public void setDuracionLlamada(int duracionLlamada) {
        this.duracionLlamada = duracionLlamada;
    }
}