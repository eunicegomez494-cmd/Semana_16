package Ejercicios.Uped;

public class Jerarquia {
    public static void main(String[] args){
        Exception a = new SaldoInsuficienteException("x",1);
        RuntimeException b = new MontoInvalidoException("y");
        System.out.println(a instanceof Exception);
        System.out.println(a instanceof RuntimeException);
        System.out.println(b instanceof RuntimeException);
        System.out.println(a);
    }
}
