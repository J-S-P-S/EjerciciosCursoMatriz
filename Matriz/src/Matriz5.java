public class Matriz5 {

    public static void main(String[] args) {
        int[][] m = {{35, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        int elemento = 1999;
        boolean encontrado = false;
        int i = 0, j = 0;
        buscar:
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                if (m[i][j] == elemento) {
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if (encontrado) {
            System.out.println("Elemento " + elemento + " en la posición " + i + "," + j);
        } else {
            System.out.println("Elemento " + elemento + ". No se encuentra en la matriz.");
        }

    }
}