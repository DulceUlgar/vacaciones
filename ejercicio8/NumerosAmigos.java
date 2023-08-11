package ejercicio8;

public class NumerosAmigos {
    public static void main(String[] args) {
        int num1 = 220;
        int num2 = 284;
        
        boolean sonAmigos = sonNumerosAmigos(num1, num2);

        if (sonAmigos) {
            System.out.println(num1 + " y " + num2 + " son números amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " no son números amigos.");
        }
    }

    public static boolean sonNumerosAmigos(int num1, int num2) {
        return (sumarDivisores(num1) == num2) && (sumarDivisores(num2) == num1);
    }

    public static int sumarDivisores(int numero) {
        int suma = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        return suma;
    }
}
