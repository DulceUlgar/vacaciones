package ejercicio3;
public class TestNumeroArmstrong {
    public static void main(String[] args) {
        // Ejecutamos algunos tests para probar el programa
        testArmstrong(371); // Es un número de Armstrong
        testArmstrong(153); // Es un número de Armstrong
        testArmstrong(9474); // Es un número de Armstrong
        testArmstrong(123); // No es un número de Armstrong
        testArmstrong(8208); // Es un número de Armstrong
    }

    public static void testArmstrong(int numero) {
        System.out.println("Test para el número " + numero + ":");
        boolean esArmstrong = NumeroArmstrong.esNumeroArmstrong(numero);
        System.out.println(numero + " es un número de Armstrong: " + esArmstrong);
        System.out.println("-------------------------");
    }
}
