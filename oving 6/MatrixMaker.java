import java.util.Scanner;

public final class MatrixMaker {
    private final int[][] matrix1;
    private final int[][] matrix2;
    private final int rows;
    private final int cols;

    public MatrixMaker(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions.");
        }
        this.rows = matrix1.length;
        this.cols = matrix1[0].length;

        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public int[][] getMatrix1() {
        return matrix1;
    }

    public int[][] getMatrix2() {
        return matrix2;
    }

    public int[][] multiplyMatrices() {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return result;
    }

    public int[][] divideMatrices() {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix2[i][j] != 0) {
                    result[i][j] = matrix1[i][j] / matrix2[i][j];
                } else {
                    result[i][j] = 0; 
                }
            }
        }
        return result;
    }

    public int[][] transposeMatrix(int[][] matrix) {
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public void menu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            boolean keepGoing = true;

            while (keepGoing) {
                System.out.println("Choose an operation:");
                System.out.println("1. Multiply Matrices");
                System.out.println("2. Divide Matrices");
                System.out.println("3. Transpose First Matrix");
                System.out.println("4. Transpose Second Matrix");
                System.out.println("5. Exit");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.println("Result of multiplication:");
                        printMatrix(multiplyMatrices());
                    }
                    case 2 -> {
                        System.out.println("Result of division:");
                        printMatrix(divideMatrices());
                    }
                    case 3 -> {
                        System.out.println("Transpose of the first matrix:");
                        printMatrix(transposeMatrix(matrix1));
                    }
                    case 4 -> {
                        System.out.println("Transpose of the second matrix:");
                        printMatrix(transposeMatrix(matrix2));
                    }
                    case 5 -> {
                        keepGoing = false;
                        System.out.println("Exiting...");
                    }
                    default -> System.out.println("Invalid option, please try again.");
                }
                System.out.println();
            }
        }
    }  
}
