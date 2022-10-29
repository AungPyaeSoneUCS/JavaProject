import java.util.Scanner;

public class Factorials {

        public static void main(String[] args) {
            int factor=1;
            int num ;
            Scanner scanner= new Scanner(System.in);
            System.out.print("Enter Number :");
            num= scanner.nextInt();

            for (int i = 1; i <= num; i++) {
                factor *= i;
            }
            System.out.println("Factorial of "+ num + " is equal to "+ factor );

    }
}
