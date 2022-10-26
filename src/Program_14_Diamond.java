/*
Write a program in Java to display the pattern like a diamond.
 While loop
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
 */

import java.util.Scanner;

public class Program_14_Diamond {
    public static void main(String[] args) {
        diamond();

    }

    public static void diamond() {
        System.out.print("Input number for half of the diamond's rows : ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i <= x; i++) {
            for (int j = 1; j <= x - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for (int i = x - 1; i >= 1; i--) {
            for (int j = 1; j <= x - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}