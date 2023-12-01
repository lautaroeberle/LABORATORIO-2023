package ejercicio456;

import java.util.HashMap;

public class Departamento extends Vivienda {
private int cantidadDeAmbientes;

    public Departamento(String codigoPostal, String direccion, ejercicio456.Dueño dueño, HashMap<Integer, HashMap<Mes, Integer>> consumoPorAño, int cantidadDeAmbientes) {
        super(codigoPostal, direccion, dueño, consumoPorAño);
        this.cantidadDeAmbientes = cantidadDeAmbientes;
    }

    public int getCantidadDeAmbientes() {
        return cantidadDeAmbientes;
    }

    public void setCantidadDeAmbientes(int cantidadDeAmbientes) {
        this.cantidadDeAmbientes = cantidadDeAmbientes;
    }
    @Override
    public void cargarConsumo(int año, Mes mes, int consumo){

    }
}
