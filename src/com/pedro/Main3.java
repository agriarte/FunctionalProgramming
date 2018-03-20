package com.pedro;


// enviando un behavior como parámetro de método
// se crea un interface
public class Main3 {

    public static void main(String[] args) {
        System.out.println(process("Hola Mundo3", str -> str.toLowerCase()));
    }

    private static String process(String str, Processor3 processor) {
        return processor.process(str);
    }
}
@FunctionalInterface
interface Processor3 {
    String process(String str);
}