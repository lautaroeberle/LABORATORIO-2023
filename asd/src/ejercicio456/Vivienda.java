package ejercicio456;
import java.util.HashMap;
public abstract class Vivienda {
    private String codigoPostal;
    private String direccion;
    private Dueño Dueño;
    private HashMap<Integer,HashMap<Mes,Integer>>consumoPorAño;

    public Vivienda(String codigoPostal, String direccion, ejercicio456.Dueño dueño, HashMap<Integer, HashMap<Mes, Integer>> consumoPorAño) {
        this.codigoPostal = codigoPostal;
        this.direccion = direccion;
        Dueño = dueño;
        this.consumoPorAño = consumoPorAño;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ejercicio456.Dueño getDueño() {
        return Dueño;
    }

    public void setDueño(ejercicio456.Dueño dueño) {
        Dueño = dueño;
    }

    public HashMap<Integer, HashMap<Mes, Integer>> getConsumoPorAño() {
        return consumoPorAño;
    }

    public void setConsumoPorAño(HashMap<Integer, HashMap<Mes, Integer>> consumoPorAño) {
        this.consumoPorAño = consumoPorAño;
    }

    public void cargarConsumo(int año, Mes mes, int consumo){
    }

}
