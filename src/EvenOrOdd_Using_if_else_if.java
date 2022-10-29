import java.util.Scanner;

public class EvenOrOdd_Using_if_else_if {
    public static void main(String[] args) {
        System.out.print("Enter Number  :");
        Scanner scanner = new Scanner(System.in);

        int num = new Scanner(System.in).nextInt();

        if( num %2 == 0){
            System.out.println("that number is even number");
        }else if( num %2 == 1) {
            System.out.println("that number is odd number");
        }

    }
}
