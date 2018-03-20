package com.pedro;

import java.util.function.BiFunction;
import java.util.function.Function;

//lambda
public class Main5 {

    public static void main(String[] args) {
        //lambda
        System.out.println(process("Hola Mundo5", str -> str.toUpperCase()));
        //functional
        System.out.println(process("Hola Mundo5", String::toLowerCase));

        //lambda
        System.out.println(process2("Hola Mundo5", 3, (str,i)  -> str.substring(i)));
        //
        System.out.println(process2("Hola Mundo5", 2, String::substring));


        String cadena ="MR. ";
        //lambda
        System.out.println(process("Hola Mundo5", str -> cadena.concat(str)));
        //
        System.out.println(process("Hola Mundo5", cadena::concat));

    }

    private static String process2(String str, int i, BiFunction<String,Integer,String> processsor) {
        return processsor.apply(str,i);
    }

    private static String process(String str, Function<String, String> processor) {
        return processor.apply(str);
    }


}