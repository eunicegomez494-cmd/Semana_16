package Ejercicios.Uped;

public class Impresora implements AutoCloseable {
    private String nombre;

    public Impresora(String nombre) {
        this.nombre = nombre;
        System.out.println("Conectando " + nombre);
    }

    public void imprimir(String texto) {
        if (texto.isEmpty()) {
            throw new IllegalArgumentException("Nada que imprimir");
        }
        System.out.println(nombre + " imprime: " + texto);
    }

    @Override
    public void close() {
        System.out.println("Desconectando " + nombre);
    }
}