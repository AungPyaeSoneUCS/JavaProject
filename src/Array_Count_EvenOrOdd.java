import java.util.Scanner;

public class Array_Count_EvenOrOdd {

    public static void main(String args[]){


        System.out.print("Enter a number of array you want to create  :");
        Scanner scanner = new Scanner(System.in);

        int userInputArraySize = new Scanner(System.in).nextInt();

        int numbers[] = new int[userInputArraySize];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter Your Array Data " + (i+1) + " : ");
            numbers[i] = scanner.nextInt();
        }
        int countEven=0, countOdd=0;
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]%2==0)
                countEven++;
            else
                countOdd++;
        }

        System.out.println("\nEven Number: " +countEven);
        System.out.println("Odd Number: " +countOdd);


        /*
        int array[]={1,2,3,4,5,6,7,8,9,11,13,25,35};

        System.out.println("Odd Numbers:");
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                System.out.println(array[i]);
            }
        }



        System.out.println("Even Numbers:");
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                System.out.println(array[i]);
            }
        }

        */

    }

}
