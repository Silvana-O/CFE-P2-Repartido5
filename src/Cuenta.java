public class Cuenta {

    private String numero;
    private String titular;
    private double saldo;

    public Cuenta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("No se puede retirar: saldo insuficiente.");
        }
    }

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("12345", "Juana Sosa");

        c1.depositar(1000);
        c1.retirar(300);
        c1.retirar(800);

        System.out.println("Saldo final: $" + c1.getSaldo());
        }

}
