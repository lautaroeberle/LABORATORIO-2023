package Personas;

import Fecha.Fecha;

public class Empleado extends Persona {


    int dni;

    String pais;

    int numeroTelefono;


    public Empleado(){
        super();
        dni = 123456;
        pais = "Argentina";
        numeroTelefono = 9876543;
    }

    public Empleado(String nombre, Fecha nacimiento, int dni, String pais, int numeroTelefono) {
        super(nombre, nacimiento);
        this.dni = dni;
        this.pais = pais;
        this.numeroTelefono = numeroTelefono;
    }



    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

}