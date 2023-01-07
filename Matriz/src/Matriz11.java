public class Matriz11 {

    public static void main(String[] args) {
        //Matriz identidad

        int[][] m = new int[5][5];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(i==j){
                    m[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }



    }
}