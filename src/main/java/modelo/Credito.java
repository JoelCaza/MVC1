package modelo;

/*
 * Clase que representa un crédito.
 */
public class Credito {
    private double monto; // Monto del crédito
    private int plazo; // Plazo del crédito en meses

    /*
     * Constructor de la clase Credito.
     * @param monto Monto del crédito.
     * @param plazo Plazo del crédito en meses.
     */
    public Credito(double monto, int plazo) {
        this.monto = monto;
        this.plazo = plazo;
    }

    /*
     * Método getter para obtener el monto del crédito.
     * @return Monto del crédito.
     */
    public double getMonto() {
        return monto;
    }

    /*
     * Método setter para establecer el monto del crédito.
     * @param monto Monto del crédito.
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

    /*
     * Método getter para obtener el plazo del crédito.
     * @return Plazo del crédito en meses.
     */
    public int getPlazo() {
        return plazo;
    }

    /*
     * Método setter para establecer el plazo del crédito.
     * @param plazo Plazo del crédito en meses.
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    /*
     * Método para calcular el monto total del crédito.
     * @return Monto total del crédito.
     */
    public double calcularTotal() {
        double interes = 0;
        switch (plazo) {
            case 12:
                interes = 0.25;
                break;
            case 24:
                interes = 0.45;
                break;
            case 36:
                interes = 0.60;
                break;
            case 60:
                interes = 0.75;
                break;
        }
        return monto * (1 + interes);
    }

    /*
     * Método para calcular el pago mensual del crédito.
     * @return Pago mensual del crédito.
     */
    public double calcularPagoMensual() {
        return calcularTotal() / plazo;
    }
}
