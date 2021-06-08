import java.util.Scanner;

public class HA7cStringReverseRecursion {
    static void stringReverse(String txt){
        if (txt == null || txt.length() <= 1)
            System.out.print(txt);
        else {
            int lstIndex = txt.length() - 1;
            System.out.print(txt.charAt(lstIndex));
            txt = txt.substring(0, lstIndex);
            stringReverse(txt);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program Reverses the string using Recursion");

        System.out.print("Enter the String: ");
        String txt = sc.nextLine();

        System.out.print("Your String after Reverse: ");
        stringReverse(txt);
        System.out.println();
    }
}
