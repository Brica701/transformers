package org.iesvdm.transformer;

public class LispList<E> {
    private Cell<E> myList;

    // Constructor privado
    LispList(Cell<E> list) {
        myList = list;
    }

    public LispList(String alice, String bob, String charlie) {
    }

    // Método estático para crear una lista de enteros
    public static LispList<Integer> of(int... elements) {
        LispList<Integer> list = empty(); // Crear una lista vacía
        for (int i = elements.length - 1; i >= 0; i--) {
            list = new LispList<>(new Cell<>(elements[i], list.myList)); // Construir la lista
        }
        return list; // Retornar la lista creada
    }

    public boolean isEmpty() {
        return myList == null; // Verificar si la lista está vacía
    }

    public E head() {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        return myList.first; // Retornar el primer elemento
    }

    public LispList<E> tail() {
        if (isEmpty()) throw new IllegalStateException("List is empty");
        return new LispList<>(myList.rest); // Retornar el resto de la lista
    }

    public LispList<E> cons(E item) {
        return new LispList<>(new Cell<>(item, myList)); // Añadir un elemento al inicio
    }

    public static <T> LispList<T> empty() {
        return new LispList<>(null); // Retornar una lista vacía
    }

    public boolean equals(Object other) {
        if (!(other instanceof LispList<?>)) return false;
        LispList<E> otherList = (LispList<E>) other;
        if (this.isEmpty()) return otherList.isEmpty();
        return this.head().equals(otherList.head()) && this.tail().equals(otherList.tail());
    }

    public String toString() {
        if (isEmpty()) return "[]"; // Representación de lista vacía
        return "[" + head() + restToString(tail()); // Representación de la lista
    }

    private static <T> String restToString(LispList<T> l) {
        if (l.isEmpty()) return "]";
        return "," + l.head() + restToString(l.tail()); // Construir cadena de texto
    }

    // Clase interna Cell
    private static class Cell<T> {
        T first; // Primer elemento
        Cell<T> rest; // Resto de la lista

        Cell(T h, Cell<T> t) {
            first = h; // Inicializar primer elemento
            rest = t; // Inicializar resto de la lista
        }
    }
}

