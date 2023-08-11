package ejercicio8;

public class TestNumerosAmigos {
    public static void main(String[] args) {
        testSonNumerosAmigos(220, 284, true);
        testSonNumerosAmigos(1184, 1210, true);
        testSonNumerosAmigos(2620, 2924, true);
        testSonNumerosAmigos(5020, 5564, true);
        testSonNumerosAmigos(6232, 6368, true);

        testSonNumerosAmigos(1184, 2620, false);
        testSonNumerosAmigos(5020, 6232, false);
        testSonNumerosAmigos(220, 1184, false);
    }

    public static void testSonNumerosAmigos(int num1, int num2, boolean expectedResult) {
        boolean result = NumerosAmigos.sonNumerosAmigos(num1, num2);
        String status = result == expectedResult ? "Éxito" : "Fallo";

        System.out.println("Prueba para " + num1 + " y " + num2 + ": " + status);
    }
}
