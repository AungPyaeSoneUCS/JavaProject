import java.util.Scanner;

public class Array_Sorting_Decrease {

    public static void main(String[] args) {

        System.out.print("Enter a number of array you want to create  :");
        Scanner scanner = new Scanner(System.in);

        int userInputArraySize = new Scanner(System.in).nextInt();
        int array[] = new int[userInputArraySize];


        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Your Array Data " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        int temp = 0;

        System.out.println("original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("\n \n \ndescending order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");


        }


    }
}