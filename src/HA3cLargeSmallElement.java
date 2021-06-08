import java.util.*;

public class HA3cLargeSmallElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("It is a Program to find Largest and Smallest element in the Array");
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i<n; i++){
            System.out.printf("Enter Element [%d]: ", i);
            array[i] = sc.nextInt();
        }

        int large, small;
        large = array[0];
        small = array[0];

        for(int i = 0; i<n; i++){
            if(array[i]>large)
                large = array[i];
            if(array[i]<small)
                small = array[i];
        }

        System.out.println("\nThe largest element is " + large);
        System.out.println("The smallest element is " + small);
    }
}
