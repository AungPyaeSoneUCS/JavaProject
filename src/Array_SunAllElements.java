import java.util.Scanner;

public class Array_SunAllElements {

    public static void main(String[] args) {


        System.out.print("Enter a number of array you want to create  :");
        Scanner scanner = new Scanner(System.in);

        int userInputArraySize = new Scanner(System.in).nextInt();

        int numbers[] = new int[userInputArraySize];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter Your Array Data " + (i+1) + " : ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }

}
