package HA7e;

public class HA7eStringMethods {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        StringMethods obj = new StringMethods();
        obj.input();

        char repeat;
        int choice;

        do {
            System.out.println("""
                                
                    ------------------------------
                    Select an Option from the menu
                    ------------------------------""");
            System.out.println("""
                \t1. length()
                \t2. concat()
                \t3. toCharArray()
                \t4. charAt()
                \t5. compareTo()
                \t6. contains()
                \t7. split()
                \t8. indexOf()
                \t9. toString()
                \t10. reverse()
                \t11. replace()
                \t12. subString()""");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            System.out.println("------------------------------");
            obj.switchClass(choice);

            System.out.print("\nDo you want to Return to Main Menu? Y/N...");
            repeat = sc.next().charAt(0);
        }while (repeat == 'Y' || repeat == 'y');
    }
}
