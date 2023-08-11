package ejercicio11;

public class TestPlaneta {
    public static void main(String[] args) {
        Planeta planeta1 = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 149, Planeta.TipoPlaneta.TERRESTRE,
                true, 1, 24);
        
        Planeta planeta2 = new Planeta("Júpiter", 79, 1.898e27, 1.43128e15, 139822, 778, Planeta.TipoPlaneta.GASEOSO,
                false, 11.9, 9.9);

        System.out.println("Información del Planeta 1:");
        planeta1.imprimirInformacion();

        System.out.println("Información del Planeta 2:");
        planeta2.imprimirInformacion();
    }
}
