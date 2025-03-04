import java.io.IOException;
import java.util.Scanner;

public class Juego_Laberinto {

    @SuppressWarnings("ConvertToTryWithResources")
    public int play1()  throws InterruptedException {
        limpiarConsola();
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanneo = new Scanner(System.in);

        // Crear una instancia de la clase Trampa1
        trampa1 trampa = new trampa1(5, 5);  // 5 filas y 5 columnas
        // Crear una instancia de la clase Trampa2
        trampa2 trampas = new trampa2(5, 5);

        // Generar un número aleatorio
        double randomValue = Math.random();
        System.out.println("El juego trata de lo siguiente: te encuentras en unas plataformas de las cuales unas caen y otras no, debes salir de las plataformas para ello se te dará durante 5 segundos el mapa y tras ello deberas poner TODO JUNTO EN UNA SOLA LINEA el camino a seguir. Los 1 son plataformas seguras, los 0 platafromas que se caen por lo que moririas y el 2 es donde inicias. Empecemos.");
        Thread.sleep(10000);
        System.out.println("\033[35mTienes 5 segundos para aprenderte el proximo nivel: ");
        // Si el número aleatorio es menor que 0.5, mostrar Trampa1, de lo contrario mostrar Trampa2
        if (randomValue < 0.5) {
            trampa.mostrarTablero1();
            Thread.sleep(5000);  // Pausa de 5 segundos
            for (int i = 0; i < 20; i++) {
                limpiarConsola();  // Imprime 20 líneas vacías
            }
            System.out.println("\033[37mHora de jugar");

            // Solicitar al usuario el camino
            System.out.print("Introduce el camino siendo u arriba, d abajo, l izquierda, r derecha: ");
            String path = scanneo.nextLine();  // Leer la entrada del usuario

            // Verificar el camino
            if (path.equals("lluuurrrru")) {
                System.out.println("¡Has ganado!");
                return 1;
            } else {
                System.out.println("¡Has perdido!");
                return 2;
            }
        } else {
            trampas.mostrarTablero2();
            Thread.sleep(10000);  // Pausa de 10 segundos
            for (int i = 0; i < 20; i++) {
                limpiarConsola();  // Imprime 20 líneas vacías para que no se vea el camino
            }
            System.out.println("Hora de jugar");
            // Solicitar al usuario el camino
            System.out.print("Introduce el camino siendo u arriba, d abajo, l izquierda, r derecha: ");
            String path = scanneo.nextLine();  // Leer la entrada del usuario
            // Verificar el camino
            if (path.equals("ruullluu")) {
                System.out.println("¡Has ganado!");
                scanneo.close();
                return 1;
            } else {
                System.out.println("¡Has perdido!");
                scanneo.close();
                return 2;
            }
        }

    }

    public static void limpiarConsola() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("No se pudo limpiar la consola.");
        }

    }
}
