import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_DeleteDuplicateElements {

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,5,5,6,7,8,9,10};
        ArrayList<Integer> new_array = new ArrayList<>();

        System.out.println("Our Array :" + Arrays.toString(array));

        System.out.print("Enter Duplicate Number You Want to Delete in that Array : ");

        int num = new Scanner(System.in).nextInt();



        for(int i=0 ;i<array.length;i++){
            if(array[i] != num){
                new_array.add(array[i]);

            }
        }
        System.out.println("After deletion :" + new_array);

    }
}
