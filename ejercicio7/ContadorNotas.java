package ejercicio7;

public class ContadorNotas {
    public static void main(String[] args) {
        double[] notas = { 2.5, 3.8, 2.0, 4.2, 3.6 };
        int cantidadNotasAprobadas = contarNotasAprobadas(notas);

        System.out.println("Cantidad de notas mayores o iguales a 3.0: " + cantidadNotasAprobadas);
    }

    public static int contarNotasAprobadas(double[] notas) {
        int contador = 0;

        for (double nota : notas) {
            if (nota >= 3.0) {
                contador++;
            }
        }

        return contador;
    }
}
