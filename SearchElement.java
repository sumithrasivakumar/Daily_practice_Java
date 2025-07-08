package practice;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] myList = new int[size];
        System.out.println("enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            myList[i] = scanner.nextInt();
        }
        System.out.println("Enter the search element:");
        int search = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (myList[i] == search) {
                System.out.println("element is find " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}

