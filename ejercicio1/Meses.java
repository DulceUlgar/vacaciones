public class Meses {
    public static void main(String[] args) {
        // Aquí puedes llamar a la función que deseas probar con los distintos valores
        // Por ejemplo:
        // int numeroMes = 5; // Cambia este valor para probar diferentes meses
        // mostrarNombreYDias(numeroMes);
    }

    public static void mostrarNombreYDias(int numeroMes) {
        String nombreMes;
        int dias;

        switch (numeroMes) {
            case 1:
                nombreMes = "Enero";
                dias = 31;
                break;
            case 2:
                nombreMes = "Febrero";
                dias = 28; // Supondremos que no es un año bisiesto
                break;
            case 3:
                nombreMes = "Marzo";
                dias = 31;
                break;
            case 4:
                nombreMes = "Abril";
                dias = 30;
                break;
            case 5:
                nombreMes = "Mayo";
                dias = 31;
                break;
            case 6:
                nombreMes = "Junio";
                dias = 30;
                break;
            case 7:
                nombreMes = "Julio";
                dias = 31;
                break;
            case 8:
                nombreMes = "Agosto";
                dias = 31;
                break;
            case 9:
                nombreMes = "Septiembre";
                dias = 30;
                break;
            case 10:
                nombreMes = "Octubre";
                dias = 31;
                break;
            case 11:
                nombreMes = "Noviembre";
                dias = 30;
                break;
            case 12:
                nombreMes = "Diciembre";
                dias = 31;
                break;
            default:
                nombreMes = "Mes inválido";
                dias = 0;
                break;
        }

        System.out.println("El mes " + numeroMes + " es " + nombreMes + " y tiene " + dias + " días.");
    }
}
