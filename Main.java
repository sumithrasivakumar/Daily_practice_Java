package practice;

public class Main {
        public static void main(String[] args) {
            int n = 7; // Number of rows for the upper half of the diamond

            // Upper half including middle line
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = 1; j <=n; j++) {
                    if (i==1 || i==n || i==(n/2+1) || (j==1 && i<=(n/2))||(j==n&&i>=(n/2)+1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }
                System.out.println();
            }
        }
    }

