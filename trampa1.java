public class trampa1 {
    @SuppressWarnings("FieldMayBeFinal")
    private int[][] tablero1;
    @SuppressWarnings("FieldMayBeFinal")
    private int filas;
    @SuppressWarnings("FieldMayBeFinal")
    private int columnas;

    public trampa1(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.tablero1 = new int[filas][columnas];
        colocarCamino1();  // Method to set values on the board
    }

    // Fill the tablero1 array with predefined values
    private void colocarCamino1() {
        int[][] mapa = {
                {0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 2, 0, 0}
        };//lluuurrrru

        // Assigning values from the mapa to tablero1
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i < mapa.length && j < mapa[i].length) {
                    tablero1[i][j] = mapa[i][j];
                }
            }
        }
    }

    // Method to display the board
    public void mostrarTablero1() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero1[i][j] + " ");
            }
            System.out.println();  // New line for the next row
        }
    }
}
