package Personas;

import  Fecha.Fecha;

public class Jugador extends Persona {
    int numerocamisetajugador;

    public Jugador(){
        super();
    }
    public Jugador(String nombre, Fecha nacimiento, int numerocamisetajugador) {
        super(nombre, nacimiento);
        this.numerocamisetajugador = numerocamisetajugador;
    }

    public int getNumerocamisetajugador() {
        return numerocamisetajugador;
    }

    public void setNumerocamisetajugador(int numerocamisetajugador) {
        this.numerocamisetajugador = numerocamisetajugador;
    }
}