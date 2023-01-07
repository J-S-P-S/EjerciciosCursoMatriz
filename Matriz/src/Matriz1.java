public class Matriz1 {

    public static void main(String[] args) {

        int[][] n = new int[2][4];
        System.out.println("Número de filas = " + n.length);
        System.out.println("Número de columnas = " + n[0].length);

        n[0][0] = 1;
        n[0][1] = 2;
        n[0][2] = 3;
        n[0][3] = 4;

        n[1][0] = 11;
        n[1][1] = 12;
        n[1][2] = 13;
        n[1][3] = 14;

        System.out.println("Primer elemento = " + n[0][0]);
        System.out.println("Último elemento = " + n[n.length-1][n[0].length-1]);

        int n1 = n[0][0];
        int n2 = n[0][1];
        int n3 = n[0][2];
        int n4 = n[0][3];

        int n5 = n[1][0];
        int n6 = n[1][1];
        int n7 = n[1][2];
        int n8 = n[1][3];

        System.out.print("n1 = " + n1 + " \tn2 = " + n2 + " \tn3 = " + n3 + " \tn4 = " + n4);
        System.out.print("\nn5 = " + n5 + " \tn6 = " + n6 + " \tn7 = " + n7 + " \tn8 = " + n8);

    }
}