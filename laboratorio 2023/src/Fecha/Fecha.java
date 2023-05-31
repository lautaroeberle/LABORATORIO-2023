package Fecha;

public class Fecha {

    public int dia;
    public int mes;

    public int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;

    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String valida() {
        String listo = "a";
        if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (año >= 1000 && año <= 2023)) {
            listo = "La fecha es correcta :)";
        }
        if (dia < 1 || dia > 31) {
            listo = "La fecha es incorrecta. Se actualizaron los datos";
            dia = 1;
        }
        if (mes < 1 || mes > 12) {
            listo = "La fecha es incorrecta. Se actualizaron los datos";
            mes = 1;
        }
        if (año < 1000 || año > 2023) {
            listo = "La fecha es incorrecta. Se actualizaron los datos";
            año = 1900;
        }
        switch (mes) {

            case 2:
                if (dia> 28) {
                    listo = "La fecha es incorrecta. Se actualizaron los datos";
                    dia=1;

                }
                break;


            case 4:
                if (dia> 30) {
                    listo = "La fecha es incorrecta. Se actualizaron los datos";
                    dia=1;
                }
                break;

            case 6:
                if (dia > 30) {
                    listo = "La fecha es incorrecta. Se actualizaron los datos";
                    dia=1;
                }
                break;


            case 9:
                if (dia > 30) {
                    listo = "La fecha es incorrecta. Se actualizaron los datos";
                    dia=1;
                }
                break;

            case 11:
                if (dia > 30) {
                    listo = "La fecha es incorrecta. Se actualizaron los datos";
                    dia=1;

                }
                break;


        }

        return listo;
    }

    public int diasMes(int mes) {
        int cantdias = 0;
        switch (mes) {
            case 1:
                cantdias = 31;
                break;
            case 2:
                cantdias = 28;
                break;
            case 3:
                cantdias = 31;
                break;
            case 4:
                cantdias = 30;
                break;
            case 5:
                cantdias = 31;
                break;
            case 6:
                cantdias = 30;
                break;
            case 7:
                cantdias = 31;
                break;
            case 8:
                cantdias = 31;
                break;
            case 9:
                cantdias = 30;
                break;
            case 10:
                cantdias = 31;
                break;
            case 11:
                cantdias = 30;
                break;
            case 12:
                cantdias = 31;
                break;

        }
        return cantdias;
    }

    public String corto() {
        String fechaCorto = "(" + dia + "-" + mes + "-" + año + ")";
        return fechaCorto;
    }

    public String larga() {
        String dialarga = " ";
        String diamez = " ";
        for (int i = 1; i <= 31; i = i + 7) {

            if (dia == 1 || dia == 8 || dia == 15 || dia == 22 || dia == 29) {

                dialarga = "Lunes";

            }
            if (dia == 2 || dia == 9 || dia == 16 || dia == 23 || dia == 30) {

                dialarga = "Martes";

            }
            if (dia == 3 || dia == 10 || dia == 17 || dia == 24 || dia == 31) {

                dialarga = "Miercoles";

            }
            if (dia == 4 || dia == 11 || dia == 18 || dia == 25) {

                dialarga = "Jueves";

            }
            if (dia == 5 || dia == 12 || dia == 19 || dia == 26) {

                dialarga = "Jueves";

            }
            if (dia == 6 || dia == 13 || dia == 20 || dia == 27) {

                dialarga = "Viernes";

            }
            if (dia == 7 || dia == 14 || dia == 21 || dia == 28) {

                dialarga = "Domingo";

            }
        }

        switch (mes) {
            case 1:
                diamez = " Enero";
                break;
            case 2:
                diamez = " Febrero";
                break;
            case 3:
                diamez = " Marzo";
                break;
            case 4:
                diamez = "Abril";
                break;
            case 5:
                diamez = "Mayo";
                break;
            case 6:
                diamez = "Junio";
                break;
            case 7:
                diamez = "Julio";
                break;
            case 8:
                diamez = "Agosto";
                break;
            case 9:
                diamez = "Septiembre";
                break;
            case 10:
                diamez = "Octubre";
                break;
            case 11:
                diamez = "Noviembre";
                break;
            case 12:
                diamez = "Diciembre";
                break;
        }


        String diaenlargo = "(" + dialarga + " " + dia + " de" + diamez + " de " + año + ")";
        return diaenlargo;

    }


    public int siguiente() {
        int sigdia = 0;
        switch (mes) {

            case 1:
                if (dia == 31) {
                    dia = 1;
                    mes = 2;
                } else {
                    dia++;
                }
                break;
            case 2:
                if (dia == 28) {
                    dia = 1;
                    mes = 3;
                } else {
                    dia++;
                }
                break;
            case 3:
                if (dia == 31) {
                    dia = 1;
                    mes = 4;
                } else {
                    dia++;
                }
                break;
            case 4:
                if (dia == 30) {
                    dia = 1;
                    mes = 5;
                } else {
                    dia++;
                }
                break;
            case 5:
                if (dia == 31) {
                    dia = 1;
                    mes = 6;
                } else {
                    dia++;
                }
                break;
            case 6:
                if (dia == 30) {
                    dia = 1;
                    mes = 7;
                } else {
                    dia++;
                }
                break;
            case 7:
                if (dia == 31) {
                    dia = 1;
                    mes = 8;
                } else {
                    dia++;
                }
                break;
            case 8:
                if (dia == 31) {
                    dia = 1;
                    mes = 9;
                } else {
                    dia++;
                }
                break;
            case 9:
                if (dia == 30) {
                    dia = 1;
                    mes = 10;
                } else {
                    dia++;
                }
                break;
            case 10:
                if (dia == 31) {
                    dia = 1;
                    mes = 11;
                } else {
                    dia++;
                }
                break;
            case 11:
                if (dia == 30) {
                    dia = 1;
                    mes = 12;
                } else {
                    dia++;
                }
                break;
            case 12:
                if (dia == 31) {
                    dia = 1;
                    mes = 1;
                    año++;
                } else {
                    dia++;
                }
                break;

        }

        return sigdia;
    }

    public int anterior() {
        int antdia = 0;
        switch (mes) {

            case 1:
                if (dia == 1) {
                    dia = 31;
                    mes = 12;
                    año--;
                } else {
                    dia--;
                }
                break;
            case 2:
                if (dia == 1) {
                    dia = 31;
                    mes = 1;
                } else {
                    dia--;
                }
                break;
            case 3:
                if (dia == 1) {
                    dia = 28;
                    mes = 2;
                } else {
                    dia--;
                }
                break;
            case 4:
                if (dia == 1) {
                    dia = 31;
                    mes = 3;
                } else {
                    dia--;
                }
                break;
            case 5:
                if (dia == 1) {
                    dia = 31;
                    mes = 4;
                } else {
                    dia--;
                }
                break;
            case 6:
                if (dia == 1) {
                    dia = 31;
                    mes = 5;
                } else {
                    dia--;
                }
                break;
            case 7:
                if (dia == 1) {
                    dia = 30;
                    mes = 6;
                } else {
                    dia--;
                }
                break;
            case 8:
                if (dia == 1) {
                    dia = 31;
                    mes = 7;
                } else {
                    dia--;
                }
                break;
            case 9:
                if (dia == 1) {
                    dia = 31;
                    mes = 8;
                } else {
                    dia--;
                }
                break;
            case 10:
                if (dia == 1) {
                    dia = 30;
                    mes = 9;
                } else {
                    dia--;
                }
                break;
            case 11:
                if (dia == 1) {
                    dia = 31;
                    mes = 10;
                } else {
                    dia--;
                }
                break;
            case 12:
                if (dia == 1) {
                    dia = 30;
                    mes = 11;
                } else {
                    dia--;
                }
                break;

        }

        return antdia;
    }

    public String igualque(int diaz, int mesz, int añoz) {

        String igualquecomprobar;

        if ((dia == diaz) && (mes == mesz) && (año == añoz)) {
            igualquecomprobar = "Las fechas coinciden";
        } else {
            igualquecomprobar = "Las fechas no coinciden";
        }
        return igualquecomprobar;
    }

    public String menorque(int diaq, int mesq, int añoq) {
        String menorquecomprobar = " ";
        if(año<=añoq){
            menorquecomprobar = "La fecha es anterior";
            if(mes<=mesq){
                menorquecomprobar = "La fecha es anterior";
            }
            if (dia<=diaq) {
                menorquecomprobar = "La fecha es anterior";
            }
        }

        if (( añoq <= año)&& ( mesq <= mes) && ( diaq <= dia)){
            menorquecomprobar = "La fecha NO es anterior";
        }
        return menorquecomprobar;
    }
    public String mayorrque(int diae, int mese, int añoe) {
        String  mayorquecomprobar = " ";
        if(año<=añoe){
            mayorquecomprobar = "La fecha es POSTERIOR";
            if(mes<=mese){
                mayorquecomprobar = "La fecha es POSTERIOR";
            }
            if (dia<=diae) {
                mayorquecomprobar = "La fecha es POSTERIOR";
            }
        }

        if (( añoe <= año)&& ( mese <= mes) && ( diae <= dia)){
            mayorquecomprobar = "La fecha NO es posterior";
        }


        return mayorquecomprobar;
    }

}






