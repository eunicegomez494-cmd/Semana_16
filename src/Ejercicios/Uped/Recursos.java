package Ejercicios.Uped;

import Ejercicios.Uped.Impresora;

public class Recursos {
    public static void main(String[] args) {
        try (Impresora p = new Impresora("Caja 1")) {
            p.imprimir("Recibo #101");
        }
        System.out.println("---");
        try (Impresora p = new Impresora("Caja 2")) {
            p.imprimir("");
            System.out.println("No se llega aqui");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}