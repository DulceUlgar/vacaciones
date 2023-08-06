public class TestMeses {
    public static void main(String[] args) {
        // Ejecutamos algunos tests para probar el programa
        testMes(1); // Enero - 31 días
        testMes(2); // Febrero - 28 días
        testMes(4); // Abril - 30 días
        testMes(6); // Junio - 30 días
        testMes(9); // Septiembre - 30 días
        testMes(12); // Diciembre - 31 días
        testMes(13); // Mes inválido
    }

    public static void testMes(int numeroMes) {
        System.out.println("Test para el mes " + numeroMes + ":");
        Meses.mostrarNombreYDias(numeroMes);
        System.out.println("-------------------------");
    }
}
