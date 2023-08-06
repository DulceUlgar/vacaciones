package ejercicio4;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Cambia este valor para obtener más o menos números de Fibonacci
        calcularFibonacci(n);
    }

    public static void calcularFibonacci(int n) {
        int num1 = 0;
        int num2 = 1;

        System.out.println("Los primeros " + n + " números de Fibonacci:");

        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(num1 + ", ");
            } else {
                System.out.println(num1);
            }

            int suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
    }

    public static int[] obtenerFibonacci(int n) {
        int[] fibonacciArray = new int[n];
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < n; i++) {
            fibonacciArray[i] = num1;

            int suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }

        return fibonacciArray;
    }
}

