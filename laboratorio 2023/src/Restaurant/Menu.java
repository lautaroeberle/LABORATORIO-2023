package Restaurant;
import Fecha.Fecha;
import Personas.Alumno;
import Personas.Persona;
import Personas.Profesor;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    ArrayList<Alumno> alumnos;
    ArrayList<Profesor> profesores;
    ArrayList<Plato> platos;
    ArrayList<Pedido> pedidos;

    public Menu(ArrayList<Alumno> alumnos, ArrayList<Profesor> profesores, ArrayList<Plato> platos, ArrayList<Pedido> pedidos) {
        alumnos = new ArrayList<Alumno>();
        profesores = new ArrayList<Profesor>();
        platos = new ArrayList<Plato>();
        pedidos = new ArrayList<Pedido>();
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }


    public void menuModificar(){


        System.out.println("1. Modificar - Platos. ");
        System.out.println("2. Modificar - Pedidos. ");

        Scanner entrada = new Scanner(System.in);
        int opcionmenumodificar = entrada.nextInt();

        switch (opcionmenumodificar){

            case 1:
                System.out.println("Que quiere modificar del plato:");
                System.out.println("1. Nombre");
                System.out.println("2. Precio");
                Scanner entrada23 = new Scanner(System.in);
                int opcionModPlato = entrada23.nextInt();
                switch (opcionModPlato){
                    case 1:
                        System.out.println(" Ingrese el nombre del plato a cambiar el nombre. ");
                        Scanner entradaa12 = new Scanner(System.in);
                        String nombreplato = entradaa12.nextLine();
                        System.out.println(" Ingrese el nuevo nombre del plato. ");
                        Scanner entradaa1 = new Scanner(System.in);
                        String nuevoNombre = entradaa1.nextLine();

                        for (Plato x : platos ){
                            if (x.getNombre() == nombreplato){
                                x.nombre = nuevoNombre;
                                System.out.println("El nombre del plato fue actualizado correctamente a: " + nuevoNombre);
                            }
                            else {
                                System.out.println(" No se encontro ningun plato con ese nombre. ");
                            }
                        }
                        break;
                    case 2:
                        System.out.println(" Ingrese el nombre y precio del plato a cambiar el precio. ");
                        Scanner entradaanp = new Scanner(System.in);
                        String nombreplato1 = entradaanp.nextLine();
                        Scanner entradaprecio = new Scanner(System.in);
                        int precioPlato = entradaprecio.nextInt();
                        System.out.println(" Ingrese el nuevo precio del plato. ");
                        Scanner entrada2 = new Scanner(System.in);
                        int nuevoPrecio = entrada2.nextInt();

                        for (Plato x : platos ){
                            if ((x.getNombre() == nombreplato1) && (x.getPrecio() == precioPlato)){
                                x.precio = nuevoPrecio;
                                System.out.println("El precio del plato fue actualizado correctamente a: " + nuevoPrecio);
                            }
                            else {
                                System.out.println(" No se encontro ningun plato con ese nombre y precio. ");
                            }
                        }
                        break;
                }
                break;

            case 2:
                System.out.println("Que quiere modificar del pedido:");
                System.out.println("1. Fecha de creacion. ");
                System.out.println("2. Plato ");
                System.out.println("3. Orden de la persona ");
                System.out.println("4. Hora de entrega ");
                System.out.println("5. Si se entrego o no");
                Scanner entradamp = new Scanner(System.in);
                int opcionModPedido = entradamp.nextInt();
                switch (opcionModPedido){
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                }
                break;
        }

    }

    public void menuAgregar(){

        System.out.println("1. Agregar  - Platos. ");
        System.out.println("2. Agregar  - Pedidos. ");

        Scanner entrada = new Scanner(System.in);
        int opcionmenuagregar = entrada.nextInt();

        switch (opcionmenuagregar){

            case 1:
                Plato p1 = new Plato();
                platos.add(p1);
                System.out.println("Agregado correctamente. ");
                break;


            case 2:
                Pedido pedido = new Pedido();
                pedidos.add(pedido);
                System.out.println("Agregado correctamente. ");
                break;
        }

    }

    public void menuaEliminar(){

        System.out.println("1. Eliminar - Platos. ");
        System.out.println("2. Eliminar - Pedidos. ");

        Scanner entrada = new Scanner(System.in);
        int opcionmenueliminar = entrada.nextInt();

        switch (opcionmenueliminar){

            case 1:
                System.out.println(" Ingrese el nombre del plato a borrar. ");
                Scanner entrada1 = new Scanner(System.in);
                String nom1 = entrada.nextLine();

                for (Plato i : platos){
                    if (i.getNombre() == nom1){
                        platos.remove(i);
                        System.out.println(" Eliminado correctamente. ");
                    }
                    else {
                        System.out.println(" No se encontro en la lista de platos. ");
                    }
                }
                break;

            case 2:
                System.out.println(" Ingrese el nombre del plato del pedido a borrar. ");
                Scanner entrada2 = new Scanner(System.in);
                String nom2 = entrada.nextLine();

                for (Pedido i : pedidos){
                    if (i.getPlato().nombre == nom2){
                        pedidos.remove(i);
                        System.out.println(" Eliminado correctamente. ");
                    }
                    else {
                        System.out.println(" No se encontro en la lista de pedidos. ");
                    }
                }
                break;


        }

    }

    public void extraerLista( Fecha fechapedido, Profesor profesor){

        for (Pedido x : pedidos){
            if (x.getFechadecreacion() == fechapedido) {
                if ( (x.getPersonapedidor().nombre == profesor.nombre) &&  (x.getPersonapedidor().apellido == profesor.apellido)) {
                    x.plato.precio = x.plato.precio * profesor.getPorcentajedescuento();
                    System.out.println(x.plato);
                }
                else {
                    System.out.println("No se encuentra ningun descuento. ");
                    System.out.println(x.plato);
                }
            }
            else {
                System.out.println("No se encuentra ningun plato con pedido en esa fecha. ");
            }
        }
    }

}