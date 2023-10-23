package ABM_Mascotas;
import Personas.Persona;
import Fecha.fecha;
public abstract class Mascota {
    private fecha fechaNacimiento;
    private Persona duenio;
    private String nombre;

    public Mascota(fecha fechaNacimiento,Persona duenio,String nombre) {
        this.fechaNacimiento=fechaNacimiento;
        this.duenio =duenio;
        this.nombre=nombre;
    }

    public fecha getFechaNacimiento() { return fechaNacimiento; }
    public Persona getDuenio() { return duenio; }
    public String getNombre() { return nombre; }
    public void setFechaNacimiento(fecha fechaNacimiento) { this.fechaNacimiento=fechaNacimiento; }
    public void setDuenio(Persona duenio) { this.duenio = duenio; }
    public void setNombre(String nombre) { this.nombre=nombre; }
    abstract String tipoAnimal();
    abstract void alimentar();
}