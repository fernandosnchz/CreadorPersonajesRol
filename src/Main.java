import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduzca los apellidos: ");
        String apellidos = sc.nextLine();

        System.out.println("Introduzca su raza (Humano, Elfo, Orco): ");
        String raza = sc.nextLine();

        Heroe hero = new Heroe(nombre, apellidos, raza);
        hero.mostrarInfo();

        sc.close();
    }
}