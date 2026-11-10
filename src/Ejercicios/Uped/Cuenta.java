package Ejercicios.Uped;

public class Cuenta {
    private String titular;
    private int saldo;

    public Cuenta(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(int monto) {
        if (monto <= 0) {
            throw new MontoInvalidoException("El monto debe ser positivo: " + monto);
        }
        saldo += monto;
    }

    public void retirar(int monto) throws SaldoInsuficienteException {
        if (monto <= 0) {
            throw new MontoInvalidoException("El monto debe ser positivo: " + monto);
        }
        if (monto > saldo) {
            throw new SaldoInsuficienteException(
                    "Saldo insuficiente para retirar " + monto, monto - saldo);
        }
        saldo -= monto;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}