package SistemaControlCalorias;

import java.util.ArrayList;

public class Persona{
    private ArrayList<Plato> platos;

    public Persona() {
        this.platos = platos;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public int caloriasTotales(){
        int caloriasTotales = 0;
        for (Plato plato : platos){
            caloriasTotales += plato.getCalorias();
        }
        return caloriasTotales;
    }
}
