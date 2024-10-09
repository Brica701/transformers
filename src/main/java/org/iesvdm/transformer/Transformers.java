package org.iesvdm.transformer;

import java.util.ArrayList;

public class Transformers {

    // Método para aplicar una transformación y devolver una nueva lista
    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a) {
        ArrayList<T> b = new ArrayList<>();
        for (T t : a) {
            b.add(tran.transform(t)); // Aplicar la transformación
        }
        return b; // Devolver la nueva lista
    }

    // Método para aplicar la transformación directamente a la lista original
    public static <T> void applyDest(Transformer<T> tran, ArrayList<T> a) {
        for (int i = 0; i < a.size(); i++) {
            T transformedValue = tran.transform(a.get(i)); // Transformar el valor
            a.set(i, transformedValue); // Establecer el valor transformado en la posición original
        }
    }

    // Método para transformar una LispList usando un Transformer
    public static <T> LispList<T> transformList(Transformer<T> transformer, LispList<T> lispList) {
        if (lispList.isEmpty()) {
            return LispList.empty(); // Retornar lista vacía si la entrada está vacía
        } else {
            T transformedHead = transformer.transform(lispList.head()); // Transformar la cabeza
            LispList<T> transformedTail = transformList(transformer, lispList.tail()); // Llamada recursiva a la cola
            return transformedTail.cons(transformedHead); // Construir la nueva lista
        }
    }
}




