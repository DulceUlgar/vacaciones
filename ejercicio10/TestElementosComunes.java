package ejercicio10;

import java.util.List;

public class TestElementosComunes {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 3, 4, 4, 5, 2 };
        int[] array2 = { 2, 3, 4, 4, 5, 6, 7 };
        testBuscarElementosComunes(array1, array2, new int[] { 2, 3, 4, 5 });

        int[] array3 = { 1, 2, 3, 4, 5 };
        int[] array4 = { 6, 7, 8, 9, 10 };
        testBuscarElementosComunes(array3, array4, new int[] {});

        int[] array5 = { 1, 2, 3, 4, 5 };
        int[] array6 = { 5, 4, 3, 2, 1 };
        testBuscarElementosComunes(array5, array6, new int[] { 1, 2, 3, 4, 5 });
    }

    public static void testBuscarElementosComunes(int[] array1, int[] array2, int[] expectedElementosComunes) {
        List<Integer> elementosComunes = ElementosComunes.buscarElementosComunes(array1, array2);

        if (elementosComunes.size() == expectedElementosComunes.length) {
            boolean success = true;

            for (int i = 0; i < elementosComunes.size(); i++) {
                if (elementosComunes.get(i) != expectedElementosComunes[i]) {
                    success = false;
                    break;
                }
            }

            if (success) {
                System.out.println("Prueba: Éxito");
                return;
            }
        }

        System.out.println("Prueba: Fallo");
    }
}
