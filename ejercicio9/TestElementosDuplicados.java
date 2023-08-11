package ejercicio9;

public class TestElementosDuplicados {
    public static void main(String[] args) {
        int[] numeros1 = { 2, 3, 4, 3, 5, 6, 5, 7, 8, 8 };
        testEncontrarElementosDuplicados(numeros1, new int[] { 3, 5, 8 });

        int[] numeros2 = { 1, 2, 3, 4, 5 };
        testEncontrarElementosDuplicados(numeros2, new int[] {});

        int[] numeros3 = { 1, 1, 1, 1, 1 };
        testEncontrarElementosDuplicados(numeros3, new int[] { 1 });

        int[] numeros4 = { 5, 6, 7, 8, 9, 5, 6, 7, 8, 9 };
        testEncontrarElementosDuplicados(numeros4, new int[] { 5, 6, 7, 8, 9 });
    }

    public static void testEncontrarElementosDuplicados(int[] numeros, int[] expectedDuplicados) {
        int[] duplicados = ElementosDuplicados.encontrarElementosDuplicados(numeros);
        boolean success = true;

        if (duplicados.length != expectedDuplicados.length) {
            success = false;
        } else {
            for (int i = 0; i < duplicados.length; i++) {
                if (duplicados[i] != expectedDuplicados[i]) {
                    success = false;
                    break;
                }
            }
        }

        String status = success ? "Éxito" : "Fallo";
        System.out.println("Prueba: " + status);
    }
}
