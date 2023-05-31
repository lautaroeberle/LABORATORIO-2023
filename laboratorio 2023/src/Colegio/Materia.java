package Colegio;

import java.util.ArrayList;

public class Materia {

    public String nombre;

    public ArrayList<Integer> Notasmateria;

    public Materia(String nombre, ArrayList<Integer> notasmateria) {
        this.nombre = nombre;
        Notasmateria = notasmateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotasmateria() {
        return Notasmateria;
    }

    public void setNotasmateria(ArrayList<Integer> notasmateria) {
        Notasmateria = notasmateria;
    }
}

