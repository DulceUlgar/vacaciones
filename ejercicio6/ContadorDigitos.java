package ejercicio6;

public class ContadorDigitos {
    public static void main(String[] args) {
        // Ejemplo: Comprobar el número de dígitos de 12345
        int numero = 12345;
        int cantidadDigitos = contarDigitos(numero);

        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");
    }

    public static int contarDigitos(int numero) {
        int contador = 0;

        if (numero == 0) {
            return 1;
        }

        while (numero != 0) {
            numero /= 10;
            contador++;
        }

        return contador;
    }
}
