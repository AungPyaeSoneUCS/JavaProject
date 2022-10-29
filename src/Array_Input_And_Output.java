import java.util.Scanner;

public class Array_Input_And_Output {

    public static void main(String[] args) {


        System.out.print("Enter a number of array you want to create  :");
        Scanner scanner = new Scanner(System.in);

        int userInputArraySize = new Scanner(System.in).nextInt();
        int numbers[] = new int[userInputArraySize];


        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter Your Array Data " + (i + 1) + " : ");
            numbers[i] = scanner.nextInt();
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i] + "\t");
        }
    }
}
