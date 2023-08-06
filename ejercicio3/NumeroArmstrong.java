package ejercicio3;

public class NumeroArmstrong {
    public static void main(String[] args) {
        // Aquí puedes llamar a la función que deseas probar con diferentes números
        // Por ejemplo:
        // int numero = 371; // Cambia este valor para probar diferentes números
        // boolean esArmstrong = esNumeroArmstrong(numero);
        // System.out.println(numero + " es un número de Armstrong: " + esArmstrong);
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
