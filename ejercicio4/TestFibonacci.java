package ejercicio4;
public class TestFibonacci {
    public static void main(String[] args) {
        testCalcularFibonacci(10);
        testObtenerFibonacci(5);
    }

    public static void testCalcularFibonacci(int n) {
        System.out.println("Test calcularFibonacci(" + n + "):");
        Fibonacci.calcularFibonacci(n);
        System.out.println("-------------------------");
    }

    public static void testObtenerFibonacci(int n) {
        System.out.println("Test obtenerFibonacci(" + n + "):");
        int[] fibonacciArray = Fibonacci.obtenerFibonacci(n);
        for (int num : fibonacciArray) {
            System.out.print(num + ", ");
        }
        System.out.println();
        System.out.println("-------------------------");
    }
}
