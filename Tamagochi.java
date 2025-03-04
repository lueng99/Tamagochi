public class Tamagochi {

    // Atributos tamagochi
    public int vida = 100;
    private int estadoDeAnimo = 10;
    private int edad = 0; // Nueva variable para la edad

    // Constructores
    public Tamagochi(int vida, int estadoDeAnimo) {
        this.vida = vida;
        this.estadoDeAnimo = estadoDeAnimo;
        this.edad = 0;
    }

    // Getters
    public int getVida() {
        return vida;
    }

    public int getEstadoDeAnimo() {
        return estadoDeAnimo;
    }

    public int getEdad() { // Getter para la edad
        return edad;
    }

    // Setters
    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setEstadoDeAnimo(int estadoDeAnimo) {
        this.estadoDeAnimo = estadoDeAnimo;
    }

    // Método para mostrar el dragón en ASCII
    private void mostrarDragon() {
        System.out.println("        \\`-'/");
        System.out.println("        (o o)");
        System.out.println("  +--OOO--(_)----+");
        System.out.println("  |  Tu Dragón   |");
        System.out.println("  |  Edad: " + edad + " años |");
        System.out.println("  +-------------+");
    }

    // Método para aumentar la edad después de cada acción
    private void aumentarEdad() {
        edad++;
        mostrarDragon();
    }

    public int respuestasJuegoPreguntas(int contador) {
        if (contador >= 8) {
            System.out.println("Enhorabuena has ganado!!!");
            this.estadoDeAnimo = this.estadoDeAnimo + 3;
        } else {
            System.out.println("Has perdido!!!");
        }
        aumentarEdad();
        return contador;
    }

    public int comer() {
        if (this.vida >= 100) {
            this.estadoDeAnimo = this.estadoDeAnimo + 1;
        } else if (this.vida < 100) {
            this.vida = this.vida + 10;
        } else if (this.vida > 90 && this.vida < 95) {
            this.vida = this.vida + 5;
        } else if (this.vida > 95 && this.vida < 100) {
            this.vida = this.vida + 1;
        }
        aumentarEdad();
        return this.vida;
    }

    public int beber() {
        if (this.vida >= 100) {
            this.estadoDeAnimo = this.estadoDeAnimo + 2;
        } else if (this.vida < 100) {
            this.vida = this.vida + 20;
        } else if (this.vida > 80 && this.vida < 90) {
            this.vida = this.vida + 10;
        } else if (this.vida > 90 && this.vida < 95) {
            this.vida = this.vida + 5;
        } else if (this.vida > 95 && this.vida < 100) {
            this.vida = this.vida + 1;
        }
        aumentarEdad();
        return this.vida;
    }

    public int volar() {
        if (this.vida <= 100 && this.vida >= 10 && this.estadoDeAnimo < 10) {
            this.estadoDeAnimo = this.estadoDeAnimo + 1;
            this.vida = this.vida - 10;
        } else if (this.vida < 10 && this.estadoDeAnimo > 10) {
            this.vida = this.vida - 1;
        }
        aumentarEdad();
        return this.vida;
    }
    public int aumentarvida(){
        vida++;
        return vida;

    }
    public int bajarvida(){
        vida--;
        return vida;}}
