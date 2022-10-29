import java.util.Scanner;

public class Vowel_Using_Switch {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter A Character :");
        char ch = scanner.findInLine(".").charAt(0);

        switch (ch) {
            case 'a':
                System.out.println(ch + " is vowel");
                break;
            case 'e':
                System.out.println(ch + " is vowel");
                break;
            case 'i':
                System.out.println(ch + " is vowel");
                break;
            case 'o':
                System.out.println(ch + " is vowel");
                break;
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
