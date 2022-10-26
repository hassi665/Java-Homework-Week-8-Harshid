/*
Write a Java program that takes the user to provide a single character from the
 alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
 Input an alphabet: p
 Expected Output:
 Input letter is Consonant
 */

import java.util.Scanner;
import java.util.SortedMap;

public class Program_3_Consonant {
    int i = 0;

    public static void main(String[] args) {

        Program_3_Consonant obj = new Program_3_Consonant();
        obj.vowel();
    }

    public void vowel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphabet : ");
        char ch = scanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Expected Output: \n" +
                    " Input letter " + ch + " is Vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Expected Output: \n" +
                    " Input letter " + ch + " is Consonant");
        else
            System.out.println("Not an alphabet letter");
    }

}