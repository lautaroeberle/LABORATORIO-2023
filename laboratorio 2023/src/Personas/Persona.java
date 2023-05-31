package Personas;

import  Fecha.Fecha;





public class Persona {

    public  String nombre;
    public  String apellido;
    public   String direccion;
    public  Fecha nacimiento;
    public  int edad;


    public Persona(){
        this.nombre = " Persona 1";
        this.direccion = " Argentina ";
        this.edad = 30;
    }

    public Persona(String nombre, Fecha nacimiento){
        this.nombre = nombre;
        this.nacimiento = nacimiento;

    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(String nombre, String direccion, int edad){

        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
    }



    public String getNombre(){

        return nombre;

    }
    public Fecha getNacimiento() {
        return nacimiento;
    }

    public String getDireccion(){

        return direccion;

    }
    public int getEdad(){

        return edad;

    } public String getApellido() {
        return apellido;
    }



    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String mostrarDatos(){
        String Datos = "Nombre: " + nombre +" Direccion: "+ direccion + " Edad: "+ edad;
        return Datos;
    }








}