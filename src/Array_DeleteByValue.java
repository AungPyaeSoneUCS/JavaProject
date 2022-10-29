import java.util.Arrays;
import java.util.Scanner;

public class Array_DeleteByValue {
    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] new_array = new int[array.length-1];

        System.out.println("Our Array :" + Arrays.toString(array));

        System.out.print("Enter A Valu You Want to Delete in that Array : ");
        int num = new Scanner(System.in).nextInt();


        int j=0;
        for(int i=0 ;i<array.length;i++){
            if(array[i]!=num){
                new_array[j]=array[i];
                j++;
            }
        }
        System.out.println("After deletion :" + Arrays.toString(new_array));

    }
}
