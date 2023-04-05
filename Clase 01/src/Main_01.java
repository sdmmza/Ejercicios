public class Main_01 {

    public static void main(String[] args) {

        //--------------------------------------------------------------------------------
        //CLASE Nº1 - EJERCICIO Nº1a
        System.out.println("\n--------------------\nClase Nº1 - Ejercicio Nº1a\n");
        int a = 5;
        int b = 14;
        while (a <= b) {
            System.out.println(a);
            a++;
        }

        //--------------------------------------------------------------------------------
        //CLASE Nº1 - EJERCICIO Nº1b
        System.out.println("\n--------------------\nClase Nº1 - Ejercicio Nº1b\n");
        int a1 = 5;
        int b1 = 14;

        while (a1 <= b1) {
            if (a1 % 2 == 0) {
                System.out.println(a1);
            }
            a1++;
        }

        //--------------------------------------------------------------------------------
        //CLASE Nº1 - EJERCICIO Nº1c
        System.out.println("\n--------------------\nClase Nº1 - Ejercicio Nº1c\n");
        int a2 = 5;
        int b2 = 14;
        boolean mostrarPares = !true;

        while (a2 <= b2) {
            int resto = a2 % 2;
            boolean esPar = resto == 0;
            if (mostrarPares && esPar) {
                System.out.println("nº Par: " + a2);
            }
            else {
                if (!mostrarPares && !esPar) {
                    System.out.println("nº Impar: " + a2);
                }
            }
            a2++;
        }

        //--------------------------------------------------------------------------------
        //CLASE Nº1 - EJERCICIO Nº1d
        System.out.println("\n--------------------\nClase Nº1 - Ejercicio Nº1d\n");
        int a3 = 5;
        int b3 = 14;

        for (int i=b3-1; i>a3; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            a1++;
        }

        //--------------------------------------------------------------------------------
        //CLASE Nº1 - EJERCICIO Nº2
        System.out.println("\n--------------------\nClase Nº1 - Ejercicio Nº2\n");
        int ingresoMensualINDEC=489083;
        int cantidadAutosINDEC=3;
        int antiguedadAutosINDEC=5;
        int cantidadInmueblesINDEC=3;
        int embarcacionINDEC=1;
        int aeronaveINDEC=1;
        boolean activosINDEC=true;
        String segmento="A";

        int ingresoMensualPersona=0;
        int cantidadAutosPersona=0;
        int antiguedadAutosPersona=0;
        int cantidadInmueblesPersona=0;
        int embarcacionPersona=0;
        int aeronavePersona=0;
        boolean activosPersona=false;

        if ((((ingresoMensualPersona >= ingresoMensualINDEC)||
                (cantidadAutosPersona >= cantidadAutosINDEC && antiguedadAutosPersona <= antiguedadAutosINDEC)||
                (cantidadInmueblesPersona >= cantidadInmueblesINDEC)||
                (embarcacionPersona >= embarcacionINDEC || aeronavePersona >= aeronaveINDEC || activosPersona == activosINDEC)))) {
            System.out.println("La persona pertenece al segmento: " + segmento);
        }
        else {
            System.out.println("La persona NO pertenece al segmento: " + segmento);
        }

        System.out.println("\n--------------------");
    }
}