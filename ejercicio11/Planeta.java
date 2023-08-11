package ejercicio11;

public class Planeta {
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaMediaAlSol;
    private TipoPlaneta tipo;
    private boolean observableASimpleVista;
    private double periodoOrbital;
    private double periodoRotacion;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro,
                   int distanciaMediaAlSol, TipoPlaneta tipo, boolean observableASimpleVista,
                   double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.tipo = tipo;
        this.observableASimpleVista = observableASimpleVista;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia media al Sol: " + distanciaMediaAlSol + " millones de km");
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("Observable a simple vista: " + observableASimpleVista);
        System.out.println("Densidad: " + calcularDensidad() + " kg/km³");
        System.out.println("Planeta exterior: " + esPlanetaExterior());
        System.out.println("Periodo orbital: " + periodoOrbital + " años");
        System.out.println("Periodo de rotación: " + periodoRotacion + " días");
        System.out.println("--------------------------------------");
    }

    private double calcularDensidad() {
        return masa / volumen;
    }

    private boolean esPlanetaExterior() {
        double distanciaEnKM = distanciaMediaAlSol * 149597870;
        return distanciaEnKM > 340000000 || distanciaEnKM < 210000000;
    }

    public enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }
}

