package Telefonia;

import Personas.Empleado;

import java.util.ArrayList;

public class SistemaLlamadas {

    ArrayList<Llamada> llamadas;
    ArrayList<Empleado> ranking;

    public ArrayList<Empleado> getRanking() {
        return ranking;
    }

    public void setRanking(ArrayList<Empleado> ranking) {
        this.ranking = ranking;
    }

    public SistemaLlamadas(ArrayList<Llamada> llamadas, ArrayList<Empleado> ranking) {
        this.llamadas = llamadas;
        this.ranking = ranking;
    }

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public void realizarLlamada(Llamada llamada1) {
        boolean realizarLlamada = false;
        if (llamada1.getEmpleadoOrigen().getNumeroTelefono() != llamada1.getEmpleadoDestino().getNumeroTelefono()) {
            realizarLlamada = true;
            System.out.println("LLAMADA REALIZADA.");
            llamadas.add(llamada1);
        } else {
            System.out.println("EL NUMERO INGRESADO ES EL MISMO, NO SE REALIZO LA LLAMADA. ");
        }
    }


    }

















/**






 // Ordenar notas de mayor a menor utilizando el algoritmo de ordenamiento de burbuja
 for (int i = 0; i < n - 1; i++) {
 for (int j = 0; j < n - i - 1; j++) {
 if (notas[j] < notas[j+1]) {
 // intercambiar notas[j] y notas[j+1]
 double temp = notas[j];
 notas[j] = notas[j+1];
 notas[j+1] = temp;
 }
 }
 }

 // Imprimir notas ordenadas

 }
 }

 */