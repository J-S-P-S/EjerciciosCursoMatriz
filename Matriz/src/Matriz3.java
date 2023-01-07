public class Matriz3 {

    public static void main(String[] args) {

        String[][] nombres = { {"Pepe","Pepa"},{"Josefa","Paco"},{"Lucas","Pancha"}};
        int filas = nombres.length;
        int col = nombres[0].length;

        /*System.out.println("Iterando la matriz con ciclo for");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }*/

        System.out.println("Iterando la matriz con ciclo foreach");
        for (String[] fila: nombres){
            for (String nom: fila){
                System.out.print(nom + "\t");
            }
            System.out.println();
        }

    }
}