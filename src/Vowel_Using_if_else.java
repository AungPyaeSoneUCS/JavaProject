import java.util.Scanner;

public class Vowel_Using_if_else {
    public static void main(String[] args) {



        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter A Character :");
        char ch = scanner.findInLine(".").charAt(0);



        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}
