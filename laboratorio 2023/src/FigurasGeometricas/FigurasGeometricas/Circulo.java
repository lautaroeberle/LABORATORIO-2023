

package FigurasGeometricas.FigurasGeometricas;

public class Circulo {
    private int radio;


    public Circulo() {

        this.radio = 2;
    }


    public Circulo(int radio) {

        this.radio = radio;
    }


    public int getRadio() {

        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }


    public int calcularArea() {
        return (int) Math.PI * radio * radio;
    }


    public int calcularPerimetro() {
        return (int) Math.PI * 2 * radio;
    }
}
