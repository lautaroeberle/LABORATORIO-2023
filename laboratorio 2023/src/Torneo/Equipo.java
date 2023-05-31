package Torneo;

import java.util.ArrayList;



import  Fecha.Fecha;

import Personas.Jugador;
public class Equipo {
    public String nombre;
    public  String barriodepresedencia;
    public   ArrayList<Jugador> jugadores;

    public  ArrayList<Boolean> dias; // 0 1 2 3 4 5
    public  String disponibilidadHoraria; // m t arde n0ohce

    int camisetajugadorcapitan = 10;

    public int getCamisetajugadorcapitan() {
        return camisetajugadorcapitan;
    }

    public void setCamisetajugadorcapitan(int camisetajugadorcapitan) {
        this.camisetajugadorcapitan = camisetajugadorcapitan;
    }

    public Equipo (Equipo equipoAB){
        nombre = " Sin nombre ";
        dias = new ArrayList<Boolean>(6);
        jugadores = new ArrayList<Jugador>(9);
        barriodepresedencia = "Sin barrio";
        disponibilidadHoraria = "No tiene turno";
        camisetajugadorcapitan = 0;
    }
    public Equipo(String nombre, String barriodepresedencia, ArrayList<Jugador> jugadores, ArrayList<Boolean> dias, String disponibilidadHoraria, int camisetajugadorcapitan) {
        this.nombre = nombre;
        this.barriodepresedencia = barriodepresedencia;
        this.jugadores = jugadores;
        this.dias = dias;
        this.disponibilidadHoraria = disponibilidadHoraria;
        this.camisetajugadorcapitan = camisetajugadorcapitan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarriodepresedencia() {
        return barriodepresedencia;
    }

    public void setBarriodepresedencia(String barriodepresedencia) {
        this.barriodepresedencia = barriodepresedencia;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Boolean> getDias() {
        return dias;
    }

    public void setDias(ArrayList<Boolean> dias) {
        this.dias = dias;
    }

    public String getDisponibilidadHoraria() {
        return disponibilidadHoraria;
    }

    public void setDisponibilidadHoraria(String disponibilidadHoraria) {
        this.disponibilidadHoraria = disponibilidadHoraria;
    }


    public void agregarjugador(Jugador j1){
        Boolean camisetaesta = false;

        for (    Jugador i : jugadores    ){
            if (  j1.getNumerocamisetajugador() == i.getNumerocamisetajugador() ){
                camisetaesta = true;
            }
        }
        if (camisetaesta == true){
            System.out.println( "Algun jugador ya tiene la  camiseta de este jugador, reintente con otro numero. ");
        }
        if (camisetaesta == false){
            jugadores.add(j1);
            System.out.println( j1.getNombre() + " Agregado CORRECTAMENTE al equipo. -> || " + getNombre()  +  " || CON LA CAMISETA Nº " + j1.getNumerocamisetajugador() );
        }



    }

    public void mostrarjugadores(Equipo equipo){

        for (int i = 0; i < equipo.jugadores.size(); i++){
            System.out.println( "NOMBRE: " + equipo.jugadores.get(i).nombre + " CAMISETA: " + equipo.jugadores.get(i).getNumerocamisetajugador()) ;
        }

    }








}

