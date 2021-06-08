import java.util.*;

class Student{
    Scanner sc = new Scanner(System.in);

    String rollNo;
    String name;
    String course;
    String[] subject;
    int num;

    Student(){
        rollNo = "AC-1207";
        name = "Amartya Sinha";
        course = "B.Sc (Hons)";
        subject = new String[]{"Java", "DS", "Eng", "EVS"};
    }

    Student(String r, String n, String c, String[] s){
        rollNo = r;
        name = n;
        course = c;
        subject = new String[4];
        subject = s;
    }

    void input(){
        System.out.print("Enter Roll No: ");
        rollNo = sc.next();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
        System.out.print("Enter Total no of Subjects: ");
        num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i< subject.length; i++){
            System.out.printf("Enter Subject [%d]: ", i+1);
            subject[i] = sc.nextLine();
        }
    }

    void output(){
        System.out.println("Roll No = " + rollNo);
        System.out.println("Name = " + name);
        System.out.println("Course = " + course);
        for (String s : subject) {
            System.out.println("Subject = " + s);
        }
    }
}
public class HA5Student {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char repeat;

        Student stu1 = new Student();
        Student stu2 = new Student("AC-1207", "Sinha Amartya", "Bachelor in Science", new String[]{"Java", "DS", "EVS", "Eng"});
        Student stu3 = stu2;
        Student stu4 = new Student();
        Student stu5 = new Student();

        do{
            System.out.println("Select the method for output the details of the Student");
            System.out.println("1. Default Constructor\n2. Parameterized Constructor\n3. Initializing Object using Reference\n4. User Input\n5. Initialization Instance Variables using Reference ");

            System.out.print("Choice: ");
            int choice = scn.nextInt();

            switch(choice) {
                case 1 -> {
                    System.out.println("Using Default Constructor\n");
                    stu1.output();
                }
                case 2 -> {
                    System.out.println("Using Parameterized Constructor\n");
                    stu2.output();
                }
                case 3 -> {
                    System.out.println("Using Reference");
                    stu3.output();
                }
                case 4 -> {
                    stu4.input();
                    System.out.println("\nUsing User Input\n");
                    stu4.output();
                }
                case 5 -> {
                    stu5.rollNo = "AC-1207";
                    stu5.name = "amartya sinha";
                    stu5.course = "b.sc. hons.";
                    stu5.subject = new String[]{"EVS", "Java", "English", "Discrete Structures"};

                    stu5.output();
                }
                default -> System.out.println("Sorry! Wrong Choice\n");
            }
            System.out.println("Do you want to return to main menu? Y/N ");
            repeat = scn.next().charAt(0);
        }while(repeat == 'Y' || repeat == 'y');
    }
}