import java.util.*;

public class HA4bFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("It is a Program to Print the Fibonacci Series");
        System.out.print("Enter the length of Series: ");
        int n = sc.nextInt();

        int a, b, c;
        a = 0;
        b = 1;
        System.out.printf("The first %d terms in Fibonacci Series are %d, %d", n, a, b);

        for(int i = 0; i<(n-2); i++){
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}
