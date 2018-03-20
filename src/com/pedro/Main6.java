package com.pedro;

import sun.applet.Main;

import java.util.Arrays;
import java.util.Comparator;


public class Main6 {

    public static void main(String[] args) {
        //Array de String
        String[] nombres = {"Sr. Pepe", "Don Juan", "Dr. Alex",
                "Sra. Francisca"};

        //Ordena el array
        Arrays.sort(nombres);
        //Mostramos el array ya ordenado
        for (String i : nombres) {
            System.out.print(i + ", ");
        }

        //parte cada elemento del array en 2 partes con split. parte[0] y parte[1]
        //split tiene como parámetro el separador, en este caso " "
        Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.split(" ")[1].compareTo(o2.split(" ")[1]);
            }
        });
        System.out.println(Arrays.toString(nombres));

        //lambda
        Arrays.sort(nombres, Comparator.comparing(n -> n.split(" ")[1]));
        System.out.println("lambda");
        System.out.println(Arrays.toString(nombres));


        //
        Arrays.sort(nombres,Comparator.comparing(Main6::firstName));
        System.out.println(Arrays.toString(nombres));

        //
        Arrays.sort(nombres,Comparator.comparing(Main6::firstName).reversed());
        System.out.println(Arrays.toString(nombres));

        //
        Arrays.sort(nombres,Comparator.comparing(Main6::firstName).reversed().thenComparing(Main6::tratamiento));
        System.out.println(Arrays.toString(nombres));


    }

    public static String firstName(String nombre) {
        return nombre.split(" ")[1];
    }
    public static String tratamiento(String nombre) {
        return nombre.split(" ")[0];
    }
}

