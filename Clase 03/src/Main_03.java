import java.util.*;

public class Main_03 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------
        //CLASE Nº3 - EJERCICIO Nº1a
        System.out.println("\n--------------------\nClase Nº3 - Ejercicio Nº1a\n");

        String texto = "Esto es un texto de prueba para contar la cantidad de veces que aparece una letra determinada";
        char letra = 'r';
        int cantidadLetras = texto.length();
        int contador = 0;

        for (int i = 0; i < cantidadLetras; i++) {
            if (texto.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra \"" + letra + "\" aparece " + contador + " veces\n");

        //--------------------------------------------------------------------------------
        //CLASE Nº3 - EJERCICIO Nº1b
        System.out.println("\n--------------------\nClase Nº3 - Ejercicio Nº1b\n");

        int numA = 2;
        int numB = 8;
        int numC = 4;

        int vector[] = new int[]{numA, numB, numC};
        int longitudVector1 = vector.length;

        System.out.println("El vector tiene: " + longitudVector1 + " posiciones \n");
        System.out.println("Los valores del vector son: " + numA + ", " + numB + ", " + numC + "\n");
        System.out.println("El orden descendente del vector es:");

        //boolean ordenDescendente = true;
        //if (ordenDescendente = true) {        }

            if (vector[0] > vector[1] && vector[0] > vector[2] && vector[1] > vector[0]) {
                //int vectorABC[] = new int[]{vector[0], vector[1], vector[2]};
                //System.out.println(vectorABC);
                System.out.println(numA + ", " + numB + ", " + numC + "\n");
            }
            if (vector[0] > vector[1] && vector[0] > vector[2] && vector[2] > vector[1]) {
                //int vectorACB[] = new int[]{vector[0], vector[2], vector[1]};
                //System.out.println(vectorACB);
                System.out.println(numA + ", " + numC + ", " + numB + "\n");
            }
            if (vector[1] > vector[0] && vector[1] > vector[2] && vector[0] > vector[2]) {
                //int vectorBAC[] = new int[]{vector[1], vector[0], vector[2]};
                //System.out.println(vectorBAC);
                System.out.println(numB + ", " + numA + ", " + numC + "\n");
            }
            if (vector[1] > vector[0] && vector[1] > vector[2] && vector[2] > vector[0]) {
                //int vectorBCA[] = new int[]{vector[1], vector[2], vector[0]};
                //System.out.println(vectorBCA);
                System.out.println(numB + ", " + numC + ", " + numA + "\n");
            }
            if (vector[2] > vector[0] && vector[2] > vector[1] && vector[0] > vector[1]) {
                //int vectorCAB[] = new int[]{vector[2], vector[0], vector[1]};
                //System.out.println(vectorCAB);
                System.out.println(numC + ", " + numA + ", " + numB + "\n");
            }
            if (vector[2] > vector[0] && vector[2] > vector[1] && vector[1] > vector[0]) {
                //int vectorCBA[] = new int[]{vector[2], vector[0], vector[1]};
                //System.out.println(vectorCBA);
                System.out.println(numC + ", " + numB + ", " + numA + "\n");
            }

        //--------------------------------------------------------------------------------
        //CLASE Nº3 - EJERCICIO Nº1c
        System.out.println("\n--------------------\nClase Nº3 - Ejercicio Nº1c\n");

        int numeros[] = {1, 2, 8, 4, 3, 1, 6};
        int x = 3;
        System.out.println("El vector original tiene: " + numeros.length + " posiciones");

        System.out.println("\nLos valores superiores o iguales a \"x\" son:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] <= x) {
                System.out.println(numeros[i]);
            }
        }
        System.out.println("\nLa sumatoria de los valores superiores o iguales a \"x\" es:");
        int sumatoria = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] <= x) {
                sumatoria = sumatoria + numeros[i];
            }
        }
        System.out.println(sumatoria);
        System.out.println("\n--------------------");

        //--------------------------------------------------------------------------------
        //CLASE Nº3 - EJERCICIO Nº2
        System.out.println("\n--------------------\nClase Nº3 - Ejercicio Nº2\n");

        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        String frase = "mi usuario es sergio";
        System.out.println(abecedario.length() + "\n");

        String vectorLetras[] = abecedario.split("");
        System.out.println(Arrays.toString(vectorLetras));

        for (int i = 0; i < abecedario.length(); i++) {
            if (abecedario.charAt(i) == letra) {

                //TODO

            }
        }
    }

    // FUNCION PARA CODIFICAR LA FRASE
    private static String codificar;
    //TODO

    // FUNCION PARA DECODIFICAR LA FRASE
    //TODO
    private static String decodificar;

}

