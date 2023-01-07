public class Matriz7 {

    public static void main(String[] args) {
        //Matriz transpuesta

        int[][] m = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int aux = 0;

        System.out.println("Matriz original \n");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }

        for (int i = 1; i < m.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = aux;
            }
        }

        System.out.println("Matriz transpuesta \n");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}