package ejercicio3;
import java.lang.Math;
public class Calculadora2 {
    public static int sumar() {
        return (num1 + num2);
    }
    public static int restar() {
        return (num1 - num2);
    }
    public static int multiplicar() {
        return (num1 * num2);
    }
    public static int dividir() {
        return (num1 / num2);
    }
    public static double elevar() {
        return (Math.pow(num1,num2));
    }
    public static double raiz(double a) {
        return (Math.sqrt(a));
    }
    static int num1 = 144;
    static int num2 = 6;
    public static void mostrar(String operacion, int resultado) {
        System.out.println("El resultado de "+operacion+" es "+resultado);
    }

    public static void main(String[] args) {
        mostrar("sumar",sumar());
        mostrar("restar",restar());
        mostrar("multiplicar",multiplicar());
        mostrar("dividir",dividir());
        mostrar("elevar",(int)elevar());
        mostrar("hacer la raiz del primero",(int)raiz(num1));
        mostrar("hacer la raiz del segundo",(int)raiz(num2));
    }
}
