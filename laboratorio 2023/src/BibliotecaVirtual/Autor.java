package BibliotecaVirtual;

import Fecha.fecha;
import Personas.Persona;
import java.util.HashSet;

public class Autor extends Persona {
    private HashSet<LibroElectronico> bibliografia;

    public Autor(String nombre, String apellido, fecha fechaNacimiento, HashSet<LibroElectronico> bibliografia) {
        super(nombre, apellido);
        this.bibliografia = bibliografia;
    }
    public Autor() {
        super();
        this.bibliografia = new HashSet<>();
    }

    public HashSet<LibroElectronico> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(HashSet<LibroElectronico> bibliografia) {
        this.bibliografia = bibliografia;
    }

}
