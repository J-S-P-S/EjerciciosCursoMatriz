public class Matriz10 {

    public static void main(String[] args) {
        //Sumar filas y columnas de la misma matriz
        int sfil, scol;
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] b = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        System.out.println("Suma fil y col matriz  a\n");
        for (int i = 0; i < a.length; i++) {
            scol = 0;
            sfil = 0;
            for (int j = 0; j < a[0].length; j++) {
                sfil += a[i][j];
                scol += a[j][i];
            }
            System.out.println("Total fila " + i + ": " + sfil);
            System.out.println("Total columna " + i + ": " + scol);
        }
        System.out.println("Suma fil y col matriz  b\n");
        for (int i = 0; i < b.length; i++) {
            scol = 0;
            sfil = 0;
            for (int j = 0; j < b[0].length; j++) {
                sfil += b[i][j];
                scol += b[j][i];
            }
            System.out.println("Total fila " + i + ": " + sfil);
            System.out.println("Total columna " + i + ": " + scol);
        }

    }
}