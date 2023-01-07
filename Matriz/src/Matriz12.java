public class Matriz12 {

    public static void main(String[] args) {
        //Matriz marco

        int[][] m = new int[5][5];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i == 0 || i == m.length - 1) {
                    m[i][j] = 1;
                } else if (j == 0 || j == m[0].length - 1) {
                    m[i][j] = 1;
                } else if (i == j || i == 1 && j == 3) {
                    m[i][j] = 1;
                } else if (i == 3 && j == 1) {
                    m[i][j] = 1;
                }
            }
        }

        //En la ejecución normal no sale, en modo debug si sale. System.err.print para ver rojos
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i == 0 || i == m.length-1) {
                    System.out.print(m[i][j] + "\t");
                }else if (j == 0 || j == m[0].length - 1) {
                    System.out.print(m[i][j] + "\t");
                } else if (i == j || i == 1 && j == 3) {
                    System.out.print(m[i][j] + "\t");
                } else if (i == 3 && j == 1) {
                    System.out.print(m[i][j] + "\t");
                }  else {
                    System.out.print(m[i][j] + "\t");
                }
            }
            System.out.println();
        }

    }
}
