import java.util.Scanner;

/*
Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)
 */
public class Program_12_Prime {
    public static void main(String[] args) {
        primeNumber();
    }

    public static void primeNumber() {
        int input;
        int number;
        boolean primeNumber = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check: ");
        number = sc.nextInt();
        sc.close();
        for (int i = 2; i <= number / 2; i++) {
            input = number % i;
            if (input == 0) {
                primeNumber = false;
                break;
            }
        }
        if (primeNumber)
            System.out.println(number + " : This number is a Prime Number");
        else
            System.out.println(number + " : This number is not a Prime Number");
    }

}
