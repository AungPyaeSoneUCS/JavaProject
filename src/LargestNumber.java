import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number of array you want to create  :");
        Scanner scanner = new Scanner(System.in);

        int userInputArraySize = new Scanner(System.in).nextInt();

        int numbers[] = new int[userInputArraySize];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter Your Array Data " + (i+1) + " : ");
            numbers[i] = scanner.nextInt();
        }

        int maxNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }

        }

        System.out.println("The Largest input Number is "+ maxNumber);
    }
}
