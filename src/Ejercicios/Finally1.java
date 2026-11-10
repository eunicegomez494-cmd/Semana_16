package Ejercicios;

public class Finally1 {
    static void procesar(int cajas) {
        System.out.println("Inicio con " + cajas);
        try {
            int porCaja = 12 / cajas;
            System.out.println("Por caja: " + porCaja);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("finally: cierre del turno");
        }
        System.out.println("Fin de procesar");
    }

    public static void main(String[] args) {
        procesar(3);
        procesar(0);
    }
}