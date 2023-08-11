package ejercicio6;

public class TestContadorDigitos {
    public static void main(String[] args) {
        testContarDigitos(12345, 5);
        testContarDigitos(0, 1);
        testContarDigitos(789, 3);
    }

    public static void testContarDigitos(int numero, int expectedCantidadDigitos) {
        int cantidadDigitos = ContadorDigitos.contarDigitos(numero);
        String status = cantidadDigitos == expectedCantidadDigitos ? "Éxito" : "Fallo";

        System.out.println("Prueba para " + numero + ": " + status);
    }
}

