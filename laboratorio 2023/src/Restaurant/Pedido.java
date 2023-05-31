package Restaurant;


import Fecha.Fecha;
import Personas.Persona;

public class Pedido {

    Fecha fechadecreacion;

    Plato plato;

    Persona personapedidor;

    int horaentrega;

    Boolean entregado;

    public Pedido(){

        fechadecreacion = new Fecha(24,4,2010);
        plato = new Plato("Milanesa",300);
        personapedidor = new Persona();
        horaentrega = 5;
        entregado = false;





    }
    public Pedido(Fecha fechadecreacion, Plato plato, Persona personapedidor, int horaentrega, Boolean entregado) {
        this.fechadecreacion = fechadecreacion;
        this.plato = plato;
        this.personapedidor = personapedidor;
        this.horaentrega = horaentrega;
        this.entregado = entregado;
    }

    public Fecha getFechadecreacion() {
        return fechadecreacion;
    }

    public void setFechadecreacion(Fecha fechadecreacion) {
        this.fechadecreacion = fechadecreacion;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Persona getPersonapedidor() {
        return personapedidor;
    }

    public void setPersonapedidor(Persona personapedidor) {
        this.personapedidor = personapedidor;
    }

    public int getHoraentrega() {
        return horaentrega;
    }

    public void setHoraentrega(int horaentrega) {
        this.horaentrega = horaentrega;
    }

    public Boolean getEntregado() {
        return entregado;
    }

    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }
}