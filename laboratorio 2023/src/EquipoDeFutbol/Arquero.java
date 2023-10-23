package EquipoDeFutbol;

import Fecha.fecha;

import java.util.HashSet;

public class Arquero extends Jugador implements FicharJugador {

private int porcentajeAtajadas,GolesRecibidos;

    public Arquero(String nombre, int fechaDeNacimiento, Provincia provincia, int numeroDeCamiseta, HashSet<Club> equiposPorLosQuePaso, int porcentajeAtajadas, int golesRecibidos) {
        super(nombre, fechaDeNacimiento, provincia, numeroDeCamiseta, equiposPorLosQuePaso);
        this.porcentajeAtajadas = porcentajeAtajadas;
        GolesRecibidos = golesRecibidos;
    }

    public int getPorcentajeAtajadas() {
        return porcentajeAtajadas;
    }

    public void setPorcentajeAtajadas(int porcentajeAtajadas) {
        this.porcentajeAtajadas = porcentajeAtajadas;
    }

    public int getGolesRecibidos() {
        return GolesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        GolesRecibidos = golesRecibidos;
    }

    @Override
    public void contratar(){

    }
    public void renovar(){

    }




}
