package Restaurant;

public class Cafetera {

    private int capacidadmaxima;
    private int cantidadactual;



    public Cafetera(){

        this.capacidadmaxima = 1000;
        this.cantidadactual = 0;
    }
    public Cafetera(int cantidadmaxima){

        this.capacidadmaxima = cantidadmaxima;
        this.cantidadactual = 0;

    }

    public int getCantidadactual() {
        return cantidadactual;
    }
    public int getCapacidadmaxima() {
        return capacidadmaxima;
    }

    public Cafetera(int cantidadmaxima, int cantidadactual){
        this.capacidadmaxima = cantidadmaxima;
        if (cantidadactual > cantidadmaxima){
            this.cantidadactual = cantidadmaxima;
        }
        else {
            this.cantidadactual = cantidadactual;
        }
    }


    public int llenarcafetera(){

        cantidadactual = capacidadmaxima;

        return cantidadactual;

    }

    public int servirTaza(int capacidad) {

        if (cantidadactual <= capacidad) {
            capacidad=capacidad-cantidadactual;
            cantidadactual=0;
        }
        else {
            cantidadactual=cantidadactual-capacidad;
            capacidad=0;
        }
        return cantidadactual;
    }

    public int agregarTaza(int cantidad){

        cantidadactual += cantidad;

        return  cantidadactual;
    }

    public void  VaciarCafetera(){
        cantidadactual=0;
        return ;
    }
    public void AgregarCafe (int cantidad){
        cantidadactual=cantidadactual+cantidad;
        return;

    }







}