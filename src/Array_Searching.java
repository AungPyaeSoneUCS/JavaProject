import java.util.Scanner;

public class Array_Searching {
    public static void main(String[] args) {



        int[] array = {2,4,6,8,10,12,14};

        System.out.print("Enter Even Number : ");
        Scanner scanner = new Scanner(System.in);

        int num = new Scanner(System.in).nextInt();


        boolean flag = false;

        int i;

        for( i = 0; i < array.length; i++)
        {
            if(array[i] == num)
            {
                flag = true;
                break;
            }
        }

        if(flag == true)
            System.out.print("Search Found "+ num + " At index number " + i);
        else
            System.out.println("Search Not Found\n");
    }
}
