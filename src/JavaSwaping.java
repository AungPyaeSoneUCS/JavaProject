public class JavaSwaping {
    public static void main(String[] args) {

        int a =5,b=6;
        System.out.println("Before Swap");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
