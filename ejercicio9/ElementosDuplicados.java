package ejercicio9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementosDuplicados {
    public static void main(String[] args) {
        int[] numeros = { 2, 3, 4, 3, 5, 6, 5, 7, 8, 8 };
        
        int[] duplicados = encontrarElementosDuplicados(numeros);
        
        System.out.println("Elementos duplicados: ");
        for (int numero : duplicados) {
            System.out.print(numero + " ");
        }
    }

    public static int[] encontrarElementosDuplicados(int[] numeros) {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        List<Integer> duplicadosList = new ArrayList<>();

        for (int numero : numeros) {
            frecuencia.put(numero, frecuencia.getOrDefault(numero, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > 1) {
                duplicadosList.add(entry.getKey());
            }
        }

        int[] duplicadosArray = new int[duplicadosList.size()];
        for (int i = 0; i < duplicadosList.size(); i++) {
            duplicadosArray[i] = duplicadosList.get(i);
        }

        return duplicadosArray;
    }
}
