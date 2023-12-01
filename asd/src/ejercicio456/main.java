package ejercicio456;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        Dueño b = new Dueño("asd","asd",1);
        Casa a = new Casa ("1213","asd",b,new HashMap<>(),12,14);
      a.cargarConsumo(1333,Mes.ENERO,121);

    }
}
