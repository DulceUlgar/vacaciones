package ejercicio2;

public class TestAnioBiesiesto {
    public static void main(String[] args) {
        // Ejecutamos algunos tests para probar el programa
        testBisiesto(2000); // Es bisiesto (divisible entre 100 y 400)
        testBisiesto(1900); // No es bisiesto (divisible entre 100 pero no entre 400)
        testBisiesto(2024); // Es bisiesto (divisible entre 4 pero no entre 100)
        testBisiesto(2021); // No es bisiesto (no divisible entre 4)
    }

    public static void testBisiesto(int anio) {
        System.out.println("Test para el año " + anio + ":");
        boolean esBisiesto = Aniobisiesto.esBisiesto(anio);
        System.out.println(anio + " es bisiesto: " + esBisiesto);
        System.out.println("-------------------------"); 
    }
}
