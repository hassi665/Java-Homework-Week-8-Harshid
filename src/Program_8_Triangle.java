import java.util.Scanner;

/*
Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@

 */
public class Program_8_Triangle {
    public static void main(String[] args) {
        Program_8_Triangle obj8 = new Program_8_Triangle();
        obj8.nested();

    }

    public void nested() {

        int i, j, n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Triangle Rows: ");
        n = scanner.nextInt();

        for (i = 1; i<=n; i++) {
            for (j = 1; j<= i; j++)
            {
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}