package ABM_Mascotas;
import Personas.Persona;
import Fecha.fecha;
public class Pez extends Mascota {
    private int vidas;
    public Pez() {
        super();
        vidas=10;
    }
    public Pez(fecha fechaNacimiento,Persona duenio,String nombre) {
        super(fechaNacimiento,duenio,nombre);
        vidas=10;
    }
    public int getVidas() { return vidas; }
    public void setVidas(int vidas) { this.vidas=vidas; }
    @Override
    public String tipoAnimal() { return "Pez"; }
    @Override
    public void alimentar() { vidas++; }
}