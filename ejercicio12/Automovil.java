package ejercicio12;

public class Automovil {
    private String marca;
    private int modelo;
    private double motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private int velocidadMaxima;
    private Color color;
    private int velocidadActual;
    private boolean esAutomatico;
    private int multas;

    public Automovil(String marca, int modelo, double motor, TipoCombustible tipoCombustible,
                     TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos,
                     int velocidadMaxima, Color color, boolean esAutomatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0;
        this.esAutomatico = esAutomatico;
        this.multas = 0;
    }

    // Métodos get y set (omitiendo para brevedad)

    public void acelerar(int velocidad) {
        if (velocidadActual + velocidad <= velocidadMaxima) {
            velocidadActual += velocidad;
        } else {
            System.out.println("¡Multa por exceso de velocidad!");
            multas++;
        }
    }

    public void desacelerar(int velocidad) {
        if (velocidadActual - velocidad >= 0) {
            velocidadActual -= velocidad;
        }
    }

    public void frenar() {
        velocidadActual = 0;
    }

    public double calcularTiempoEstimadoLlegada(int distanciaKm) {
        return (double) distanciaKm / velocidadActual;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " litros");
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Tipo de automóvil: " + tipoAutomovil);
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Cantidad de asientos: " + cantidadAsientos);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        System.out.println("Es automático: " + esAutomatico);
        System.out.println("Multas: " + multas);
        System.out.println("--------------------------------------");
    }

    public enum TipoCombustible {
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }

    public enum TipoAutomovil {
        CARRO_CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }

    public enum Color {
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    }
}
