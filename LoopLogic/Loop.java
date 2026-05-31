package LoopLogic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int d = 6;
        while (d < 5) {
            System.out.println("The value of i is: " + d);
            d--;
        }

        // Contoh Do-While
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a number (0 to exit): ");
            number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } while (number != 0);

        // Contoh for
        System.out.println("==== Using for loop: ====");
        for (int j = 0; j < 5; j++) {
            System.out.println("The value of j is: " + j);
        }
    }
}
