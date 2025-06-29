package pattern;

import java.util.Scanner;


public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {           // Rows
            for (int j = 1; j <= N; j++) {       // Columns
                System.out.print("* ");
            }
            System.out.println();                // Newline after each row
        }
    }
}
