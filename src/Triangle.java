import java.util.Scanner;

/*
Display left angle triangle of * using nested for loops
*
 * *
 * * *
 * * * *
 * * * * *
 */
public class Triangle {
    public static void main(String[] args) {
tringle();
    }

    public static void tringle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number for traingle display: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
