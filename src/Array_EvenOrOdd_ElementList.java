import java.util.Scanner;

public class Array_EvenOrOdd_ElementList {

    public static void main(String[] args) {

        System.out.print("Enter a number of array you want to create  :");
        Scanner scanner = new Scanner(System.in);

        int userInputArraySize = new Scanner(System.in).nextInt();

        int numbers[] = new int[userInputArraySize];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter Your Array Data " + (i+1) + " : ");
            numbers[i] = scanner.nextInt();
        }



        System.out.print("Odd Numbers:");
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2!=0){
                System.out.print(numbers[i] + "   ");
            }
        }



        System.out.print("\nEven Numbers:");
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                System.out.print(numbers[i] + "   " );
            }
        }


    }

}
