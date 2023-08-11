package ejercicio12;

public class TestAutomovil {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("Toyota", 2022, 2.5, Automovil.TipoCombustible.GASOLINA,
                Automovil.TipoAutomovil.SUV, 4, 5, 180, Automovil.Color.AZUL, true);

        automovil.acelerar(100);
        automovil.mostrarInformacion();

        automovil.acelerar(20);
        automovil.mostrarInformacion();

        automovil.desacelerar(50);
        automovil.mostrarInformacion();

        automovil.frenar();
        automovil.mostrarInformacion();

        double tiempoEstimado = automovil.calcularTiempoEstimadoLlegada(300);
        System.out.println("Tiempo estimado de llegada: " + tiempoEstimado + " horas");
    }
}
