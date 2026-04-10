public class Matrix {

    private int[][] matrix;

    public Matrix(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be positive.");
        }

        matrix = new int[size][size];
        System.out.println("Matrix created with dimensions: " + size + " x " + size);
    }

    private void swap(int x1, int y1, int x2, int y2) {
        int temp = matrix[y1][x1];
        matrix[y1][x1] = matrix[y2][x2];
        matrix[y2][x2] = temp;
    }

    public void populateMatrix() {
        int value = 1;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                matrix[r][c] = value++;
            }
        }
    }

    //Print the matrix with the diagonal highlighted
    public void printMatrix() {
        int size = matrix.length;

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {

                // Highlight the diagonal (top-right → bottom-left)
                if (c == size - 1 - r) {
                    System.out.print("\u001B[43m" + matrix[r][c] + "\u001B[0m "); // yellow background
                } else {
                    System.out.print(matrix[r][c] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //Flip the matrix across the diagonal (top-right → bottom-left)
    public void flipMatrix() {
        int size = matrix.length;

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size - 1 - r; c++) {

                int mirrorCol = size - 1 - c;
                int mirrorRow = size - 1 - r;

                // Skip diagonal
                if (c == size - 1 - r) continue;

                swap(c, r, mirrorCol, mirrorRow);
            }
        }
    }
}
