
package Ejercicios;

public class Finally2 {
    static int dividir(int a, int b) {
        try {
            return a / b;
        } finally {
            System.out.println("finally de dividir(" + a + "," + b + ")");
        }
    }

    public static void main(String[] args) {
        System.out.println("Resultado: " + dividir(10, 2));
        try {
            dividir(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("main atrapa: " + e.getMessage());
        }
    }
}