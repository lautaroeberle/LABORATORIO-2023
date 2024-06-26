package FigurasGeometricas.FigurasGeometricas;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura){

        this.base = base;
        this.altura = altura;

    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base){

        this.base = base;
    }
    public void setAltura(int altura){

        this.altura = altura;

    }


    public int calcularArea(){

        return (int) base * altura;
    }
    public int calcularPerimetro(){

        return (int) altura * 2 + base * 2;

    }

}