package EmpresaVehiculos;

import Fecha.Fecha;


public class Vehiculo {

    public String marca;
    public String modelo;
    public String color;
    public int cantidadDeRuedas;
    public Fecha fechafabricacion;

    public Vehiculo(){
        this.marca = "Volkswagen";
        this.modelo = "Gol";
        this.color = "Rojo";
        this.cantidadDeRuedas = 4;
        this.fechafabricacion = new Fecha(28,9,2005);

    }
    public Vehiculo(String marca, String modelo, String color, int cantidadDeRuedas, Fecha fechafabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.fechafabricacion = fechafabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }

    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public Fecha getFechafabricacion() {
        return fechafabricacion;
    }

    public void setFechafabricacion(Fecha fechafabricacion) {
        this.fechafabricacion = fechafabricacion;
    }

}