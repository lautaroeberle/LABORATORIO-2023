package Personas;

import Colegio.Materia;
import  Fecha.Fecha;


import java.util.ArrayList;

public class Alumno extends Persona {
    public  ArrayList<Integer> Notas;
    public  ArrayList<Materia> Materias;
    public int division;

    public Alumno(){
        super();
    }
    public Alumno(String nombre, Fecha nacimiento, ArrayList<Integer> notas, int division) {
        super(nombre,nacimiento);
        this.Notas = notas;
        this.division = division;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public ArrayList<Integer> getNotas() {
        return Notas;
    }
    public ArrayList<Materia> getMaterias() {
        return Materias;
    }
    public void setNotas(ArrayList<Integer> notas) {
        Notas = notas;
    }
    public void setMaterias(ArrayList<Materia> materias) {
        Materias = materias;
    }

    public void agregarnota(int nota){

        Notas.add(nota);

    }

    public int menornota(){

        int menor = Notas.get(0);
        for ( int i = 0;i < Notas.size();i++) {
            if (Notas.get(i) <= menor) {
                menor = Notas.get(i);
                return menor;
            }
        }
        return menor;
    }

    public int mayornota(){

        int mayor = Notas.get(0);
        for ( int i = 0;i < Notas.size();i++) {

            if (Notas.get(i) >= mayor) {
                mayor= Notas.get(i);
                return mayor;
            }
        }
        return mayor;
    }

    public void aggMat(Materia materia){
        Materias.add(materia);
    }

    public int promedioNotasMat(Materia materia){
        Materias.add(materia);
        int promedio = 0;
        int suma = 0;
        for ( int i = 0; i < materia.getNotasmateria().size(); i++){

            suma = suma + materia.getNotasmateria().get(i);

            promedio = suma / materia.getNotasmateria().size();
        }
        return promedio;

    }

    public int promedioNotasAlumno(Alumno notas){

        int promedio = 0;
        int suma = 0;

        for ( int i = 0; i < notas.getNotas().size();i++){

            suma = suma + notas.getNotas().get(i);
            promedio = suma / notas.getNotas().size();

        }
        return promedio;
    }




}