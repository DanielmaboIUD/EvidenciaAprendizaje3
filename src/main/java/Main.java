import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Profesor> profesores = new ArrayList<>();
        String respuesta;

        do {
            System.out.println("\nIngrese los datos del profesor:");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Fecha de Nacimiento: ");
            String fechaNacimiento = scanner.nextLine();
            System.out.print("Género: ");
            String genero = scanner.nextLine();
            System.out.print("Estatura (metros): ");
            double estatura = Double.parseDouble(scanner.nextLine());
            System.out.print("Peso (kg): ");
            double peso = Double.parseDouble(scanner.nextLine());
            System.out.print("Profesión: ");
            String profesion = scanner.nextLine();

            profesores.add(new Profesor(nombre, apellido, fechaNacimiento, genero, estatura, peso, profesion));

            System.out.print("\n¿Desea agregar otro profesor? (si/no): ");
            respuesta = scanner.nextLine().toLowerCase();
        } while (respuesta.equals("si"));

        System.out.println("\n=== PROFESORES REGISTRADOS ===");
        for (int i = 0; i < profesores.size(); i++) {
            System.out.println("\nProfesor #" + (i + 1));
            System.out.println(profesores.get(i).mostrarInformacion());
            System.out.println("------------------------");
        }

        scanner.close();
    }
}