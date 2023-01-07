public class Matriz8 {

    public static void main(String[] args) {

        int[][] a,b;
        a = new int[8][4];
        b = new int[4][8];

        System.out.println("Matriz original a \n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = i+j*3;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        System.out.println("Matriz transpuesta de a, almacenada en matriz b");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

    }
}