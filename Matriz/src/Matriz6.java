public class Matriz6 {

    public static void main(String[] args) {
        //Saber si una matriz es simétrica o no.
        int[][] m = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        boolean sim = true;

        int i = 1, j, c = 0;

        while (i < m.length && sim) {
            j = 0;
            c++;
            while (j < i && sim){
                if (m[i][j] != m[j][i]){
                    sim = false;
                }
                j++;
            }
            i++;
        }

        if (sim){
            System.out.println("La matriz es simétrica, veces que itero en el while =  " + c);
        } else {
            System.out.println("La matriz NO es simétrica, veces que itero en el while =  " + c);
        }

        c = 0;
        salir:
        for (int k = 1; k < m.length; k++) {
            c++;
            for (int l = 0; l < k; l++) {
                if (m[k][l] != m[l][k]){
                    sim = false;
                    break salir;
                }
            }
        }

        if (sim){
            System.out.println("La matriz es simétrica, veces que itero en el for = " + c);
        } else {
            System.out.println("La matriz NO es simétrica, veces que itero en el for =  " + c);
        }

    }
}