import java.util.Scanner;

/*
Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */
public class Program_10_Armstrong {

    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner obj10 = new Scanner(System.in);
        ArmStrong(obj10.nextInt());
        obj10.close();
    }

    public static boolean ArmStrong(int number) {
        int finalNumber = 0;
        int n = number;
        while (number != 0) {
            int remainder = number % 10;
            finalNumber = finalNumber + remainder * remainder * remainder;
            number = number / 10;
        }
        if (n == finalNumber) {
            System.out.println(n + " is an Armstrong number.");
            return true;
        } else {
            System.out.println(n + " is not an Armstrong number.");
            return false;

        }
    }
}
