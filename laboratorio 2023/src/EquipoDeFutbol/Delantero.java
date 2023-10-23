package EquipoDeFutbol;

import Fecha.fecha;

import java.util.HashSet;

public class Delantero extends Jugador implements FicharJugador{
    int golesConvertidos,asistenciasRealizadas;

    public Delantero(String nombre, fecha fechaDeNacimiento, Provincia provincia, int numeroDeCamiseta, HashSet<Club> equiposPorLosQuePaso, int golesConvertidos, int asistenciasRealizadas) {
        super(nombre, fechaDeNacimiento, provincia, numeroDeCamiseta, equiposPorLosQuePaso);
        this.golesConvertidos = golesConvertidos;
        this.asistenciasRealizadas = asistenciasRealizadas;
    }

    public int getGolesConvertidos() {
        return golesConvertidos;
    }

    public void setGolesConvertidos(int golesConvertidos) {
        this.golesConvertidos = golesConvertidos;
    }

    public int getAsistenciasRealizadas() {
        return asistenciasRealizadas;
    }

    public void setAsistenciasRealizadas(int asistenciasRealizadas) {
        this.asistenciasRealizadas = asistenciasRealizadas;
    }

    @Override
    public void contratar(){

    }
    public void renovar(){

    }
}
