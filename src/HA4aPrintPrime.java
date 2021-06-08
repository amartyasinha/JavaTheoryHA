import java.util.*;

public class HA4aPrintPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("It is a program to Print all Prime Number between two user input numbers");
        System.out.print("Enter the first number: ");
        int m = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n = sc.nextInt();


        int i;
        boolean flag;

        if(m<n) {
            System.out.printf("\nAll Prime Numbers between %d and %d are:\n", m, n);
            for (i = m; i <= n; i++) {
                flag = true;
                for (int j = 2; j <= (i / 2); j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    System.out.println(i);
            }
        }

        if(m>n)
            System.out.println("Error! Cannot find Prime Numbers between these numbers");
    }
}
