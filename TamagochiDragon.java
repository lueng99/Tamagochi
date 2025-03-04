import java.util.*;
public class TamagochiDragon {

    public static void Dragon() {

        //Nombre del dragón
        Scanner teclado = new Scanner(System.in);  // Create a Scanner object
        System.out.println("¿Que nombre le deseas poner?");
        String nombre = teclado.nextLine();
        //Color del dragón

        System.out.println("¿Que color tiene?");
        String color = teclado.nextLine();
        //Accesorios

        System.out.println("¿Que accesorio le quieres añadir?\n (1) una guitarra\n (2) un lazo\n (3) unos cascos\n (4) un collar de corazón\n ");
        int opcion = teclado.nextInt();

        //Casos

        String accesorio;
        switch (opcion) {
            case 1:
                accesorio = "una guitarra ";
                break;
            case 2:
                accesorio = "un lazo ";
                break;
            case 3:
                accesorio = "unos cascos";
                break;
            case 4:
                accesorio = "uno collar de corazón ";
                break;

            default:
                System.out.println("Opción no válida, no tiene accesorios.");
                accesorio = "sin accesorios";

                System.out.println("El nombre de tu dragón es " + nombre + "\n Es de color " + color
                        + "\n y lleva " + accesorio);

                System.out.println("No perdamos más el tiempo a jugar!!!");

        }
    }
}





