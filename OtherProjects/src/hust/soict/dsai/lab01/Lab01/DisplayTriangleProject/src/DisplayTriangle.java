import java.util.Scanner;

public class DisplayTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        // Loop to iterate through each row
        for (int i = 1; i <= n; i++) {
            // Calculate the number of spaces before stars
            int spaces = n - i;

            // Print spaces and stars
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j <= spaces || j > 2 * n - spaces - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}
