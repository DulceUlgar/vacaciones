public class Aniobisiesto {
    public static void main(String[] args) {
        // Aquí puedes llamar a la función que deseas probar con diferentes años
        // Por ejemplo:
        // int anio = 2024; // Cambia este valor para probar diferentes años
        // boolean esBisiesto = esBisiesto(anio);
        // System.out.println(anio + " es bisiesto: " + esBisiesto);
    }

    public static boolean esBisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
