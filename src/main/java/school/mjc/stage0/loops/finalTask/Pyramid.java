package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }

            // Print numbers in descending order
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

//             Print numbers in ascending order
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }
}
