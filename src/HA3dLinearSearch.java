import java.util.*;

public class HA3dLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to find element in an Array using Linear Search");
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for(int i = 0; i<n; i++){
            System.out.printf("Enter Element [%d]: ", i);
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to search: ");
        int k = sc.nextInt();
        int index = 0;
        boolean flag = false;

        for(int i = 0; i<n; i++){
            if(array[i] == k) {
                index = i;
                flag = true;
                break;
            }
        }

        if(flag)
            System.out.printf("Element found at index [%d] and position %d\n", index, index+1);
        if(!flag)
            System.out.println("Element not found");



    }
}
