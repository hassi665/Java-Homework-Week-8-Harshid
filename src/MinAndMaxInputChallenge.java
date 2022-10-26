/*
-Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
mixnum();
    }

    public static void mixnum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :  ");
        int num = sc.nextInt();

        int max = num;
        int min = num;
        while (num != 0) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
            System.out.println("Enter Number : ");
            num = sc.nextInt();
        }
        if(max!=0 && min!=0){
            System.out.println("Max number is : " + max);
            System.out.println("Min number is : " + min);
        }

        }
    }
