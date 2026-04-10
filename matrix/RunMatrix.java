import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter matrix size:");
        int size = input.nextInt();

        Matrix m = new Matrix(size);

        System.out.println("\nInitial (all zeros):");
        m.printMatrix();

        m.populateMatrix();
        System.out.println("Populated:");
        m.printMatrix();

        m.flipMatrix();
        System.out.println("Flipped along diagonal:");
        m.printMatrix();
    }
}
