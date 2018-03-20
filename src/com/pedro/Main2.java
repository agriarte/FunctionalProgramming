package com.pedro;


// enviando un behavior como parámetro de método
// se crea un interface
public class Main2 {

    public static void main(String[] args) {
        System.out.println(process("Hola Mundo2", new Processor() {
            @Override
            public String process(String str) {
                return str.toLowerCase();
            }
        }));
    }

    private static String process(String str, Processor processor) {
        return processor.process(str);
    }
}

interface Processor {
    String process(String str);
}
