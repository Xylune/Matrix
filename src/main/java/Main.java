import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrixA = initMatrixA(scanner);

        int[][] matrixB = initMatrixB(scanner);

        validateMatrices(matrixA, matrixB);

        inputData(matrixA, matrixB, scanner);

        int[][] matrixC = calculateMatrix(matrixA, matrixB);

        System.out.println("\nResult is: ");
        printMatrix(matrixC);



    }

    private static void validateMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA[0].length != matrixB.length){
            System.out.println("These matrices can not be multiplied");
            System.exit(0);
        }
    }

    private static int[][] initMatrixA(Scanner scanner) {
        System.out.print("Matrix A rows: ");
        int rows = scanner.nextInt();
        System.out.print("Matrix A columns: ");
        int columns = scanner.nextInt();
        return new int[rows][columns];
    }

    private static int[][] initMatrixB(Scanner scanner) {
        System.out.print("Matrix B rows: ");
        int rows = scanner.nextInt();
        System.out.print("Matrix B columns: ");
        int columns = scanner.nextInt();
        scanner.nextLine();
        return new int[rows][columns];
    }

    private static void inputData(int[][] matrixA, int[][] matrixB, Scanner scanner) {
        System.out.println("Input data for matrix A:");
        inputMatrixData(matrixA, scanner);

        System.out.println("Input data for matrix B:");
        inputMatrixData(matrixB, scanner);
    }

    private static void inputMatrixData(int[][] matrix, Scanner scanner) {
        String[] input;
        for (int i = 0; i < matrix.length; i++){
            input = scanner.nextLine().split(" ");
            int[] intArray = new int[input.length];
            for (int j = 0; j < intArray.length; j++){
                intArray[j] = Integer.parseInt(input[j]);
            }
            matrix[i] = intArray;
        }
    }

    private static int[][] calculateMatrix(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[matrixA.length][matrixB[0].length];

        for (int i = 0; i < matrixC.length; i++){
            for (int j = 0; j < matrixC[0].length; j++){
                for (int k = 0; k < matrixB.length; k++){
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return matrixC;
    }


    static void printMatrix(int[][] matrix){
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

}
