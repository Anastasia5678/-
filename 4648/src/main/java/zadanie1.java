public class zadanie1 {
    public static void main(String[] args) {
        int k = 16; // Максимальное число в последовательности
        int N = 4;  // Размер стороны квадратной матрицы

        int[][] matrix = new int[N][N];
        int counter = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = counter;
                counter++;
            }
        }

        // Вывод матрицы
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
