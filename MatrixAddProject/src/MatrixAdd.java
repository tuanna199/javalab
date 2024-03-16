import java.util.Scanner;

public class MatrixAdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the matrices: ");
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        System.out.println("Enter elements for the first matrix:");
        inputMatrixElements(scanner, matrix1);

        System.out.println("Enter elements for the second matrix:");
        inputMatrixElements(scanner, matrix2);

        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        System.out.println("Resultant Matrix after addition:");
        displayMatrix(sumMatrix);

        scanner.close();
    }

    // Method to input matrix elements
    private static void inputMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Method to display matrix
    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
