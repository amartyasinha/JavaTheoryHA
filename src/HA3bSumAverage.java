import java.util.*;

public class HA3bSumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to find Sum and Average of element of Array");
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for(int i = 0; i<n; i++) {
            System.out.printf("Enter Element [%d]: ", i+1);
            array[i] = sc.nextInt();
        }

        double sum = 0;
        for(int i = 0; i<n; i++){
            sum += array[i];
        }
        System.out.println("The Sum is: "+sum);

        double average = sum/n;
        System.out.println("The Average is: "+average);
    }
}
