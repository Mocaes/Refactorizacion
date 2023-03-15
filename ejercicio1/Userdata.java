package ejercicio1;
import java.util.Scanner;
public class Userdata {
    public static void pedir(String request) {
        System.out.print("Introduce tu "+request+": ");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        pedir("nombre");
        String name = s.nextLine();
        pedir("nombre de usuario");
        String username = s.nextLine();
        s.close();
        System.out.println("Tu nombre: "+name);
        System.out.println("Tu usuario: "+username);
    }
}
