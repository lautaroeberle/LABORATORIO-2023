public class Vivienda {
    private String direccion;
    private int codPostal;
    private Duenio duenio;

    public Vivienda(String direccion, int codPostal, Duenio duenio) {
        this.direccion = direccion;
        this.codPostal = codPostal;
        this.duenio = duenio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
}
