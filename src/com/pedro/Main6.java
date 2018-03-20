package com.pedro;

import sun.applet.Main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main6 {

    public static void main(String[] args) {

        ArrayList<String> nombreSplit = new ArrayList<>();
        //Array de String
        String[] nombres = {"Sr. Pepe", "Don Juan", "Dr. Alex",
                "Sra. Francisca"};
        System.out.println("Array original");
        for (String i : nombres) {
            System.out.print(i + ", ");
        }
        System.out.println("\n");
        System.out.println("Array.sort(nombres)");
        //Ordena el array
        Arrays.sort(nombres);
        //Mostramos el array ya ordenado
        for (String i : nombres) {
            System.out.print(i + ", ");
        }
        System.out.println("\n");

        //parte cada elemento del array en 2 partes con split. parte[0] y parte[1]
        //split tiene como parámetro el separador, en este caso " "
        //behavior como parámetro
        System.out.println("new Comparator, split por el espacio, ordenamos por nombre");
        Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.split(" ")[1].compareTo(o2.split(" ")[1]);
            }
        });
        System.out.println(Arrays.toString(nombres));

        //lambda
        System.out.println("\nIgual pero con lambda");
        Arrays.sort(nombres, Comparator.comparing(n -> n.split(" ")[1]));
        System.out.println("lambda Comparator.comparing n.split(\" \")[1]");
        System.out.println(Arrays.toString(nombres));


        //Referencia a método estático ::MétodoEstático
        System.out.println("\nArrays.sort(nombres,Comparator.comparing(Main6::firstName));");
        Arrays.sort(nombres,Comparator.comparing(Main6::firstName));
        System.out.println(Arrays.toString(nombres));

        //
        System.out.println("\nArrays.sort(nombres,Comparator.comparing(Main6::firstName).reversed());");
        Arrays.sort(nombres,Comparator.comparing(Main6::firstName).reversed());
        System.out.println(Arrays.toString(nombres));

        //
        System.out.println("\nArrays.sort(nombres,Comparator.comparing(Main6::firstName).reversed().thenComparing(Main6::tratamiento));");
        Arrays.sort(nombres,Comparator.comparing(Main6::firstName).reversed().thenComparing(Main6::tratamiento));
        System.out.println(Arrays.toString(nombres));


        //manera1
        //crear nuevo ArrayList con solo con nombres
        //imprimir solo nombres
        for(String pivote : nombres)
        {
            System.out.println(pivote.split(" ")[1]);
            nombreSplit.add(pivote.split(" ")[1]);
        }
        System.out.println(nombreSplit);

    }

    private static String firstName(String nombre) {
        return nombre.split(" ")[1];
    }
    private static String tratamiento(String nombre) {
        return nombre.split(" ")[0];
    }
}

