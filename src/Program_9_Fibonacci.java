// Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class Program_9_Fibonacci {
    public static void main(String[] args) {
        number();
    }
    public static void number(){
        int n=100, firstNumber=1,secodNumber=1;
        System.out.println("Fibonacci Series till " + n + " :");
        for (int i=1; i<=n; ++i){
            System.out.print(firstNumber + ",");

            int nextNumber=firstNumber+secodNumber;
            firstNumber=secodNumber;
            secodNumber=nextNumber;
        }
    }
}
