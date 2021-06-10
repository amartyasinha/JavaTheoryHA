package HA7e;

public class StringMethods {
    String fName;
    String lName;
    String mobile;

    void input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter you first name: ");
        fName = sc.nextLine();
        System.out.print("Enter you last name: ");
        lName = sc.nextLine();
        System.out.print("Enter you Mobile No.: ");
        mobile = sc.next();
    }

    public String toString() {
        return ("Hi " + fName + " " + lName + ".\nYour contact no is  " + mobile);
    }

    void switchClass(int choice){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        switch (choice) {
            case 1 -> {
                System.out.println("Your first name has " + fName.length() + " characters");
                System.out.println("Your last name has " + lName.length() + " characters");
                System.out.println("Your mobile number has " + mobile.length() + " digits");
            }

            case 2 -> System.out.println("Your Full name after concatenation is " + fName.concat(lName));

            case 3 -> {
                System.out.println("Your First Name in Char Array:");
                char[] fNameToCharArray = fName.toCharArray();
                for (char s: fNameToCharArray) {
                    System.out.println(s);
                }
                System.out.println("Your Last Name in Char Array:");
                char[] lNameToCharArray = lName.toCharArray();
                for (char s: lNameToCharArray) {
                    System.out.println(s);
                }
                System.out.println("Your Mobile No. in Char Array");
                char[] mobileToCharArray = mobile.toCharArray();
                for (char s: mobileToCharArray) {
                    System.out.println(s);
                }
            }

            case 4 -> {
                System.out.println("Select the String whose character you want to know using charAt(): ");
                System.out.print("1. First Name\n2. Last Name\n3. Mobile No.\nChoice: ");
                int option = sc.nextInt();
                System.out.print("Enter the index to know the Character: ");
                int index = sc.nextInt();

                String position = "th";
                if (index == 0) { position = "st"; }
                if (index == 1) { position = "nd"; }
                if (index == 2) { position = "rd";}

                if (option == 1) { System.out.printf("The %d%s letter (index %d) of your first name is %s ", (index+1), position, index, fName.charAt(index) ); }
                else if (option == 2) { System.out.printf("The %d%s letter (index %d) of your last name is %s", (index+1), position, index, lName.charAt(index)); }
                else if (option == 3) { System.out.printf("The %d%s letter (index %d) of your mobile no. is %s", (index+1), position, index, mobile.charAt(index)); }
                else { System.out.println("Wrong Option!");}
            }

            case 5 -> {
                System.out.println("Select one compareTo option: ");
                System.out.println("1. Compare First Name to Second Name");
                System.out.print("2. Compare Second Name to First Name\nChoice: ");
                int option = sc.nextInt();

                if (option == 1) { System.out.println(fName.compareTo(lName)); }
                else if (option == 2) { System.out.println(lName.compareTo(fName)); }
                else { System.out.println("Wrong Choice!"); }
            }

            case 6 -> {
                System.out.println("Select a String in which you want to check a charSequence: ");
                System.out.print(" 1. First Name\n2. Last Name\n3. Mobile No.\nChoice: ");
                int option = sc.nextInt();

                System.out.print("Enter the charSequence that you want to check in the above String: ");
                String charSequence = sc.next();

                if (option == 1) { System.out.println(fName.contains(charSequence)); }
                else if (option == 2) { System.out.println(lName.contains(charSequence)); }
                else if (option == 3) { System.out.println(mobile.contains(charSequence)); }
                else { throw new IllegalStateException("Unexpected value: " + option); }
            }
            case 7 -> {
                System.out.println("Select a String that you want to split: ");
                System.out.print(" 1. First Name\n2. Last Name\n3. Mobile No.\nChoice: ");
                int option = sc.nextInt();

                System.out.print("Enter the regex: ");
                String regex = sc.next();
                System.out.print("Enter the limit: ");
                int limit = sc.nextInt();
                String[] split;

                if (option == 1) { split = fName.split(regex, limit); }
                else if (option == 2) { split = lName.split(regex, limit); }
                else if (option == 3) { split = mobile.split(regex, limit); }
                else { throw new IllegalStateException("Unexpected value: " + option) ; }

                for (String s : split) {
                    System.out.println(s);
                }
            }
            case 8 -> {
                System.out.println("Select a String for index check: ");
                System.out.print("1. First Name\n2. Last Name\n3. Mobile No.\nChoice: ");
                int option = sc.nextInt();

                System.out.print("Enter the character whose index you want to check: ");
                char indexCheck = sc.next().charAt(0);

                switch (option) {
                    case 1 -> System.out.println(fName.indexOf(indexCheck));
                    case 2 -> System.out.println(lName.indexOf(indexCheck));
                    case 3 -> System.out.println(mobile.indexOf(indexCheck));
                    default -> System.out.println("Wrong Choice!");
                }
            }
            case 9 -> System.out.println("Calling toString() method\n" + this);
            case 10 -> {
                System.out.print("Reversing your First Name: ");
                StringBuilder forReverse1 = new StringBuilder();
                forReverse1.append(fName);
                System.out.println(forReverse1.reverse());

                System.out.print("Reversing your Last Name: ");
                StringBuilder forReverse2 = new StringBuilder();
                forReverse2.append(lName);
                System.out.println(forReverse2.reverse());

                System.out.print("Reversing your Mobile No.: ");
                StringBuilder forReverse3 = new StringBuilder();
                forReverse3.append(mobile);
                System.out.println(forReverse3.reverse());

            }
            case 11 -> {
                System.out.println("Select a String for replacing character(s): ");
                System.out.print("1. First Name\n2. Last Name\n3. Mobile No.\nChoice: ");
                int option = sc.nextInt();

                System.out.print("Enter the character that you want to replace: ");
                char oldChar = sc.next().charAt(0);
                System.out.print("Enter the new character that you want: ");
                char newChar = sc.next().charAt(0);

                switch (option) {
                    case 1 -> System.out.println(fName.replace(oldChar, newChar));
                    case 2 -> System.out.println(lName.replace(oldChar, newChar));
                    case 3 -> System.out.println(mobile.replace(oldChar, newChar));
                    default -> System.out.println("Wrong Choice!");
                }
            }
            case 12 -> {
                System.out.println("Select a String for performing subString operation: ");
                System.out.print("1. First Name\n2. Last Name\n3. Mobile No.\nChoice: ");
                int option = sc.nextInt();

                System.out.print("Enter the starting index for subString: ");
                int start = sc.nextInt();
                System.out.print("Enter the ending index for subString: ");
                int end = sc.nextInt();
                if (option == 1 && end >= fName.length()) { end = fName.length();}
                if (option == 2 && end >= lName.length()) { end = lName.length();}
                if (option == 3 && end >= mobile.length()) { end = mobile.length();}

                switch (option) {
                    case 1 -> System.out.println(fName.substring(start, end));
                    case 2 -> System.out.println(lName.substring(start, end));
                    case 3 -> System.out.println(mobile.substring(start, end));
                    default -> System.out.println("Wrong Choice!");
                }
            }
            default -> System.out.println("Wrong Choice!");
        }
    }
}
