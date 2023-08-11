package ejercicio5;

public class NumeroPerfecto {
    public static void main(String[] args) {
        // Ejemplo: Comprobar si el número 28 es perfecto
        int numero = 28;
        boolean esPerfecto = esNumeroPerfecto(numero);
        
        System.out.println(numero + " es un número perfecto: " + esPerfecto);
    }

    public static boolean esNumeroPerfecto(int numero) {
        if (numero <= 1) {
            return false;
        }

        int sumaDivisores = 1; // Inicializamos con 1, ya que todos los números son divisibles por 1

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == numero;
    }
}
