package Torneo;

import java.util.ArrayList;


public class Fixture {

    Equipo equipo1;
    Equipo equipo2;

    String dia;

    String turno;

    public Fixture(Equipo equipo1, Equipo equipo2, String dia, String turno) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.dia = dia;
        this.turno = turno;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void MostrarFixture(){

        ArrayList<Partido> Fixture = new ArrayList<Partido>();

        Fixture.add( new Partido(equipo1,equipo2,"tarde",1));

        System.out.println(equipo1.nombre + " VS " + equipo2.nombre + " TURNO " + turno);


    }

}