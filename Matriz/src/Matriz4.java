public class Matriz4 {

    public static void main(String[] args) {

        //Matriz con tamaño de columnas variable

        int[][] m = new int[3][];

        m[0]= new int[2];
        m[1]= new int[3];
        m[2]= new int[4];

        System.out.println("Número de filas = " + m.length);
        System.out.println("Número de col1 = " + m[0].length);
        System.out.println("Número de col2 = " + m[1].length);
        System.out.println("Número de col3 = " + m[2].length);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = i*j;
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }

    }
}