package ABM_Mascotas;
import Personas.Persona;
import Fecha.fecha;
public abstract class Pajaro extends Terrestre {
    public Pajaro() { super(); }
    public Pajaro(fecha fechaNacimiento,int alegria,Persona duenio,String nombre) { super(fechaNacimiento,alegria,duenio,nombre); }
}