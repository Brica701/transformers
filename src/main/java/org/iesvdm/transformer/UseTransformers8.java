package org.iesvdm.transformer;

import java.util.ArrayList;

public class UseTransformers8 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("mundo");

        Joiner<String> joiner = new JoinBySpace();

        // Imprime la lista antes de unir
        System.out.println("Lista de palabras: " + palabras);

        String resultado = Joiners.fold(palabras, joiner);

        // Imprime el resultado
        System.out.println("Resultado de fold: " + resultado); // Debería ser "Hola mundo"
    }
}
