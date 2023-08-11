package ejercicio10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ElementosComunes {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 3, 4, 4, 5, 2 };
        int[] array2 = { 2, 3, 4, 4, 5, 6, 7 };

        List<Integer> elementosComunes = buscarElementosComunes(array1, array2);

        System.out.println("Elementos comunes: ");
        for (int elemento : elementosComunes) {
            System.out.println("Elemento duplicado: " + elemento);
        }
    }

    public static List<Integer> buscarElementosComunes(int[] array1, int[] array2) {
        Set<Integer> conjuntoArray1 = new HashSet<>();
        List<Integer> elementosComunes = new ArrayList<>();

        for (int elemento : array1) {
            conjuntoArray1.add(elemento);
        }

        for (int elemento : array2) {
            if (conjuntoArray1.contains(elemento)) {
                elementosComunes.add(elemento);
                conjuntoArray1.remove(elemento); // Evitar duplicados en la lista final
            }
        }

        return elementosComunes;
    }
}
