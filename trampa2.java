public class trampa2 {
    @SuppressWarnings("FieldMayBeFinal")
    private int[][] tablero2;
    @SuppressWarnings("FieldMayBeFinal")
    private int filas, columnas;

    public trampa2(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.tablero2 = new int[filas][columnas];
        colocarCamino2();  // Method to set values on the board
    }

    // Fill the tablero2 array with predefined values
    private void colocarCamino2() {
        int[][] mapa = {
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 2, 1, 0}
        };//ruullluu

        // Assigning values from the mapa to tablero2
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i < mapa.length && j < mapa[i].length) {
                    tablero2[i][j] = mapa[i][j];
                }
            }
        }
    }

    // Method to display the board
    public void mostrarTablero2() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero2[i][j] + " ");
            }
            System.out.println();  // New line for the next row
        }
    }
}
