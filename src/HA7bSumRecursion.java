import java.util.Scanner;

public class HA7bSumRecursion {

    static int sumRecursion(int num){
        if (num == 0)
            return num;
        return (num + sumRecursion(num - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program calculates the sum of n Natural Numbers");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.printf("The sum of Natural Numbers till %d is %d.", num, sumRecursion(num));
    }
}
