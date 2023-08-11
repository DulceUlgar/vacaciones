package ejercicio7;

public class TestContadorNotas {
    public static void main(String[] args) {
        double[] notas1 = { 2.5, 3.8, 2.0, 4.2, 3.6 };
        testContarNotasAprobadas(notas1, 3);

        double[] notas2 = { 4.0, 3.5, 3.0, 2.7, 2.8 };
        testContarNotasAprobadas(notas2, 4);

        double[] notas3 = { 2.1, 2.9, 2.5, 2.8, 2.6 };
        testContarNotasAprobadas(notas3, 0);
    }

    public static void testContarNotasAprobadas(double[] notas, int expectedCantidadAprobadas) {
        int cantidadAprobadas = ContadorNotas.contarNotasAprobadas(notas);
        String status = cantidadAprobadas == expectedCantidadAprobadas ? "Éxito" : "Fallo";

        System.out.println("Prueba: " + status);
    }
}
