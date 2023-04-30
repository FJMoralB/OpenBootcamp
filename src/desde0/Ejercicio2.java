package desde0;

public class Ejercicio2 {
    public static void main(String[] args) {
        double baseImponible = 130.33;
        double importeIva;
        int iva = 21;

        importeIva = calcularIva(baseImponible,iva);

        System.out.println("Base imponible: " + baseImponible + "\nIVA " + iva + "%: "+ importeIva );
        System.out.println("Importe Total:" + (baseImponible+importeIva));

    }
    static double calcularIva(double baseImponible, int iva) {
        return baseImponible * iva / 100;

    }
}