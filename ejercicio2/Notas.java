package ejercicio2;
import java.util.Scanner;

public class Notas {
    public static void pedir(String asignatura) {
        System.out.print("Introduce la nota de "+asignatura+": ");
    }
    public static void mostrar(String asignatura, double nota) {
        System.out.println("Tu nota de "+asignatura+" es "+nota);
    }
    public static void main(String[] args) {
        String[] asignaturas = {"Base de datos","Entornos de desarrollo","Bases de datos"};
        Scanner s = new Scanner(System.in);
        double[] notas = new double[3];
        for (int i = 0; i < 3; i++) {
            pedir(asignaturas[i]);
            notas[i] = s.nextInt();
        } s.close();
        for (int i = 0; i < 3; i++) {
            mostrar(asignaturas[i], notas[i]);
        }

    }
}
