package Ejercicios.Uped;

public class MainPropias {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Ana", 100);
        int[] retiros = { 40, 90, -5 };

        for (int r : retiros) {
            try {
                c.retirar(r);
                System.out.println("Retiro de " + r + " -> saldo " + c.getSaldo());
            } catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage() + " (faltan $" + e.getFaltante() + ")");
            } catch (MontoInvalidoException e) {
                System.out.println("Monto invalido: " + e.getMessage());
            } finally {
                System.out.println("  [registro de operacion]");
            }
        }
    }
}