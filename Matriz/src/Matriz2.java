public class Matriz2 {

    public static void main(String[] args) {

        String[][] nombres = new String[3][2];
        int filas = nombres.length;
        int col = nombres[0].length;
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Pepa";

        nombres[1][0] = "Josefa";
        nombres[1][1] = "Paco";

        nombres[2][0] = "Lucas";
        nombres[2][1] = "Pancha";

        System.out.println("Iterando la matriz con ciclo for");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Iterando la matriz con ciclo foreach");
        for (String[] fila: nombres){
            for (String nom: fila){
                System.out.print(nom + "\t");
            }
            System.out.println();
        }

    }
}