package ejercicio5;

public class TestNumeroPerfecto {
    public static void main(String[] args) {
        testNumeroPerfecto(6, true);   // 1 + 2 + 3 = 6
        testNumeroPerfecto(28, true);  // 1 + 2 + 4 + 7 + 14 = 28
        testNumeroPerfecto(12, false); // 1 + 2 + 3 + 4 + 6 = 16
    }

    public static void testNumeroPerfecto(int numero, boolean expectedResult) {
        boolean result = NumeroPerfecto.esNumeroPerfecto(numero);
        String status = result == expectedResult ? "Éxito" : "Fallo";

        System.out.println("Prueba para " + numero + ": " + status);
    }
}
