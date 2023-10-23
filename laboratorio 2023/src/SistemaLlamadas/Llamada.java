package SistemaLlamadas;
import Fecha.fecha;
import java.util.ArrayList;
public class Llamada {
    Empleado destino,origen;
    fecha fechaRealizacion;
    Hora duracion;
    public Empleado getDestino() { return destino; }
    public Empleado getOrigen() { return origen; }
    public fecha getFechaRealizacion() { return fechaRealizacion; }
    public Hora getDuracion() { return duracion; }
    public void setDestino(Empleado destino) { this.destino=destino; }
    public void setOrigen(Empleado origen) { this.origen=origen; }
    public void setFechaRealizacion(fecha fechaRealizacion) { this.fechaRealizacion=fechaRealizacion; }
    public void setDuracion(Hora duracion) { this.duracion=duracion; }
    public boolean buscarDestinatario(ArrayList<Empleado> registroEmpleados,String telefono) {
        for(Empleado empleado:registroEmpleados) {
            if(empleado.getTelefono().equals(telefono)) {
                destino=empleado;
                return true;
            }
        }
        return false;
    }
}