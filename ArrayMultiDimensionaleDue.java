public class ArrayMultiDimensionaleDue {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("first matrix is: ");
        createMatrix(numbers);

        int[][] newMatrix = swapValues(numbers);
        System.out.println("new matrix is: ");
        createMatrix(newMatrix);
    }

    public static void createMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] swapValues(int[][] matrix) {
        int line = matrix.length;
        int columns = matrix[0].length;
        int[][] newMatrix = new int[columns][line];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < columns; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }
}
//Scrivere un programma che contenga un metodo che
// permette di inizializzare una matrice e di scambiare
// le sue righe e le sue colonne stampandola a video. Matrice di partenza
//
//1 2 3  4 5 6
//Matrice risultato
//
// 1 4
// 2 5
// 3 6