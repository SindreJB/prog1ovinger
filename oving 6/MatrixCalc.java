import java.util.Scanner;

public class MatrixCalc {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter number of rows:");
            int rows = scanner.nextInt();
            System.out.println("Enter number of columns:");
            int cols = scanner.nextInt();

            int[][] matrix1 = new int[rows][cols];
            int[][] matrix2 = new int[rows][cols];

            System.out.println("Enter values for the first matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter values for the second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }
            
            MatrixMaker matrixMaker = new MatrixMaker(matrix1, matrix2);
            matrixMaker.menu();
        }
    }
}
