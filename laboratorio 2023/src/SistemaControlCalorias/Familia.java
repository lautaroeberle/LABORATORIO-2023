package SistemaControlCalorias;
import java.util.ArrayList;
import java.util.HashSet;

public class Familia {
    private HashSet<Persona>integrantes;

    public Familia(HashSet<Persona> integrantes) {
        this.integrantes = integrantes;
    }
    public Familia() {
        this.integrantes = new HashSet<Persona>();
    }

    public HashSet<Persona> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(HashSet<Persona> integrantes) {
        this.integrantes = integrantes;
    }

    public float promedioCaloriasFamilia(){
        float caloriasTotales = 0.0f;
        for (Persona Persona : integrantes){
            caloriasTotales += Persona.caloriasTotales();
        }
        return caloriasTotales/integrantes.size();
    }
    public Persona personaMasCalorica(){
        Persona persona = new Persona();
        for (Persona Persona : integrantes){
            if (persona.caloriasTotales() <= Persona.caloriasTotales()){
                persona = Persona;
            }
        }
        return persona;
    }
    public Persona personaMenosCalorica(){
        Persona persona = new Persona();
        boolean contador = false;
        for (Persona Persona : integrantes){
            if (!(contador) || persona.caloriasTotales() > Persona.caloriasTotales()){
                persona = Persona;
                contador = true;
            }
        }
        return persona;
    }
}
