package Torneo;

import java.util.ArrayList;

public class Partido {

    Equipo equipo1;
    Equipo equipo2;

    String turno;

    int diaf;

    ArrayList<Partido> fixture;


    public ArrayList<Partido> getFixture() {
        return fixture;
    }

    public void setFixture(ArrayList<Partido> fixture) {
        this.fixture = fixture;
    }

    public Partido(Equipo equipo1, Equipo equipo2, String turno, int diaf) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.turno = turno;
        this.diaf= diaf;
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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getDiaf() {
        return diaf;
    }

    public void setDiaf(int dia) {
        this.diaf = diaf;
    }

    void organizarpartidoMan(  Equipo eq1,Equipo eq2, int dia  ){
// eq 1 ( 0 0 0 0 0 1 )
        // dias = arreglo bool
        fixture = new ArrayList<Partido>();
        String diastring = "";

        switch (dia) {

            case 0 :
                diastring = "Lunes";
                break;
            case 1:
                diastring = "Martes";
                break;
            case 2 :
                diastring = "Miercoles";
                break;
            case 3:
                diastring = "Jueves";
                break;
            case 4 :
                diastring = "Viernes";
                break;
            case 5:
                diastring = "Sabado";
                break;
        }
        if (( dia < 0) || (dia > 6)){
            System.out.println("Ingrese un dia valido para el partido.");
        }
        else {

            if ( (eq1.getDisponibilidadHoraria() == "mañana" || eq1.getDisponibilidadHoraria() == "Mañana"  ) && (eq2.getDisponibilidadHoraria() == "Mañana" || eq2.getDisponibilidadHoraria() == "mañana") ){
                System.out.println("Los turnos coinciden, Ambos juegan a la mañana.");

                if( ( (eq1.dias.get(dia)) && (  eq2.dias.get(dia) ) ) == true )  {


                    System.out.println("Se puede organizar el partido el día " + diastring);
                    fixture.add( new Partido(eq1,eq2,"mañana",dia));
                }

                else {
                    System.out.println(" No se ha podido organizar el encuentro el dia " + diastring + " Debido a que la disponibilidad de dias del equipo " + eq1.getNombre() + " No coincide con la de " + eq2.getNombre());
                }

            }
            else {
                System.out.println(" Los turnos no coinciden, el equipo: " + eq1.getNombre() + " Es de turno " + eq1.getDisponibilidadHoraria() + " Y el equipo " + eq2.getNombre() + " Es de turno " + eq2.getDisponibilidadHoraria());
            }






        }
    }

    void organizarpartidoTarde(  Equipo eq1,Equipo eq2, int dia  ){

        fixture = new ArrayList<Partido>();

        String diastring = "";

        switch (dia) {

            case 0 :
                diastring = "Lunes";
                break;
            case 1:
                diastring = "Martes";
                break;
            case 2 :
                diastring = "Miercoles";
                break;
            case 3:
                diastring = "Jueves";
                break;
            case 4 :
                diastring = "Viernes";
                break;
            case 5:
                diastring = "Sabado";
                break;
        }
        if (( dia < 0) || (dia > 6)){
            System.out.println("Ingrese un dia valido para el partido.");
        }
        else {
            if ( (eq1.getDisponibilidadHoraria() == "tarde") || (eq1.getDisponibilidadHoraria() == "Tarde") && (eq2.getDisponibilidadHoraria() == "tarde" || (eq2.getDisponibilidadHoraria() == "Tarde") ) ){
                System.out.println("Los turnos coinciden, Ambos juegan al atardecer.");

                if( ( (eq1.dias.get(dia)) && (  eq2.dias.get(dia) ) ) == true )  {

                    fixture.add( new Partido(eq1,eq2,"tarde",dia));


                    System.out.println("Se puede organizar el partido el día " + diastring);

                }

                else {
                    System.out.println(" No se ha podido organizar el encuentro el dia " + diastring + " Debido a que la disponibilidad de dias del equipo " + eq1.getNombre() + " No coincide con la de " + eq2.getNombre());
                }

            }
            else {
                System.out.println(" Los turnos no coinciden, el equipo: " + eq1.getNombre() + " Es de turno " + eq1.getDisponibilidadHoraria() + " Y el equipo " + eq2.getNombre() + " Es de turno " + eq2.getDisponibilidadHoraria());
            }
        }
    }
    void organizarpartidoNoche(  Equipo eq1,Equipo eq2, int dia  ){

        fixture = new ArrayList<Partido>();

        String diastring = "";

        switch (dia) {

            case 0 :
                diastring = "Lunes";
                break;
            case 1:
                diastring = "Martes";
                break;
            case 2 :
                diastring = "Miercoles";
                break;
            case 3:
                diastring = "Jueves";
                break;
            case 4 :
                diastring = "Viernes";
                break;
            case 5:
                diastring = "Sabado";
                break;
        }
        if (( dia < 0) || (dia > 6)){
            System.out.println("Ingrese un dia valido para el partido.");
        }
        else {
            if ( (eq1.getDisponibilidadHoraria() == "noche") || (eq1.getDisponibilidadHoraria() == "Noche") && (eq2.getDisponibilidadHoraria() == "Noche") || (eq2.getDisponibilidadHoraria() == "noche") ){
                System.out.println("Los turnos coinciden, Ambos juegan a la noche.");

                if( ( (eq1.dias.get(dia)) && (  eq2.dias.get(dia) ) ) == true )  {

                    fixture.add( new Partido(eq1,eq2,"noche",dia));


                    System.out.println("Se puede organizar el partido el día " + diastring);

                }

                else {
                    System.out.println(" No se ha podido organizar el encuentro el dia " + diastring + " Debido a que la disponibilidad de dias del equipo " + eq1.getNombre() + " No coincide con la de " + eq2.getNombre());
                }

            }
            else {
                System.out.println(" Los turnos no coinciden, el equipo: " + eq1.getNombre() + " Es de turno " + eq1.getDisponibilidadHoraria() + " Y el equipo " + eq2.getNombre() + " Es de turno " + eq2.getDisponibilidadHoraria());
            }
        }
    }

}