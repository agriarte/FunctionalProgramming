package com.pedro;


import java.util.function.Function;

//lambda
public class Main4 {

    public static void main(String[] args) {
        System.out.println(process("Hola Mundo4", str -> str.toUpperCase()));
    }

    private static String process(String str, Function<String, String> processor) {
        return processor.apply(str);
    }
}
