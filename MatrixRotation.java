import java.util.Random;

public class MatrixRotation {

    public static void main(String[] args) {
        int size = 8;
        int[][] matrix = generateMatrix(size);

        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        int[][] rotatedMatrix = rotateMatrix(matrix);

        System.out.println("Матрица после поворота на 90 градусов:");
        printMatrix(rotatedMatrix);
    }

    private static int[][] generateMatrix(int size) {
        Random random = new Random();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(256); // Числа от 0 до 255
            }
        }

        return matrix;
    }

    private static int[][] rotateMatrix(int[][] matrix) {
        int size = matrix.length;
        int[][] rotated = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotated[j][size - 1 - i] = matrix[i][j];
            }
        }

        return rotated;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
        System.out.println();
    }
}
