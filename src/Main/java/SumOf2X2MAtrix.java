class MatrixSum {
    public static void main(String[] args) {
        // Define two 2x2 matrices
        int[][] matrix1 = {
                {29, 10},
                {8, 7}
        };

        int[][] matrix2 = {
                {5, 6},
                {7, 8}
        };

        // Create a result matrix to store the sum
        int[][] sum = new int[2][2];

        // Calculate the sum of the two matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the result
        System.out.println("Sum of the matrices=");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
