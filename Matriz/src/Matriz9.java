public class Matriz9 {

    public static void main(String[] args) {
        //Sumar 2 matrices y almacenar resultado en 3ra matriz.
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

        int[][] suma = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Resultado de la suma matriz a + b");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[0].length; j++) {
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }

    }
}