package SistemaBebidas;
import java.util.HashMap;
import java.util.Map;
import Fecha.fecha;
import SistemaControlCalorias.Persona;

public class Consumidor extends Persona {
    private HashMap<Bebida,Integer> bebidasConsumidas;
    private int dni;
    public Consumidor() {
        super();
        dni=0;
    }
    public Consumidor(fecha fechaNacimiento,HashMap<Bebida,Integer> bebidasConsumidas,int dni,String apellido,String nombre) {
        super();
        this.bebidasConsumidas=bebidasConsumidas;
        this.dni=dni;
    }
    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni=dni; }
    public HashMap<Bebida, Integer> getBebidasConsumidas() { return bebidasConsumidas; }
    public void setBebidasConsumidas(HashMap<Bebida, Integer> bebidasConsumidas) { this.bebidasConsumidas=bebidasConsumidas; }
    public float coeficienteHidratacion() {
        float coeficienteHidratacion=0;
        for(Map.Entry<Bebida,Integer> claveValor:bebidasConsumidas.entrySet()) coeficienteHidratacion+=claveValor.getKey().coeficienteHidratacion(claveValor.getValue());
        return coeficienteHidratacion;
    }}
