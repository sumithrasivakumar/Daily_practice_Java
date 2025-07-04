package practice;

public class CrossingPoint {
    public static void main(String[] args) {
        int n1 = 0;  // n1 starts at position 0
        int n2 = -1; // n2 starts 1 meter behind n1
        int time = 0;

        while (n2 < n1) {
            time++;
            n1 += 1; // n1 moves 1 meter
            n2 += 2; // n2 moves 2 meters
        }

        System.out.println("N2 crosses N1 at time: " + time + " seconds");
        System.out.println("Position of crossing: " + n1 + " meters");
    }
}
