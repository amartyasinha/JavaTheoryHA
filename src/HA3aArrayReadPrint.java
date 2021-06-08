import java.util.*;

public class HA3aArrayReadPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for(int i = 0; i<n; i++) {
            System.out.printf("Enter Element [%d]: ", i+1);
            array[i] = sc.nextInt();
        }

        System.out.print("The Array is: ");
        for(int i = 0; i<n; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
