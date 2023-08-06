package ejercicio3;

public class TestNumeroArmstrong {
    public static void main(String[] args) {
        // Encabezado de la tabla
        System.out.println("Número | Es Armstrong");
        System.out.println("-------------------");

        // Ejecutamos algunos tests para probar el programa
        testArmstrong(371); // Es un número de Armstrong
        testArmstrong(153); // Es un número de Armstrong
        testArmstrong(9474); // Es un número de Armstrong
        testArmstrong(123); // No es un número de Armstrong
        testArmstrong(8208); // Es un número de Armstrong
    }

    public static void testArmstrong(int numero) {
        boolean esArmstrong = esNumeroArmstrong(numero);
        System.out.print(numero);
        for (int i = 0; i < 7 - contarCifras(numero); i++) {
            System.out.print(" ");
        }
        System.out.print("| ");
        System.out.println(esArmstrong);
    }

    public static boolean esNumeroArmstrong(int numero) {
        int numOriginal = numero;
        int sumaDigitosElevados = 0;
        int numCifras = contarCifras(numero);

        while (numero > 0) {
            int digito = numero % 10;
            sumaDigitosElevados += Math.pow(digito, numCifras);
            numero /= 10;
        }

        return sumaDigitosElevados == numOriginal;
    }

    public static int contarCifras(int numero) {
        int cifras = 0;

        while (numero > 0) {
            cifras++;
            numero /= 10;
        }

        return cifras;
    }
}
