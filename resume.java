import java.util.Scanner;

public class resume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*\t*\t*\t*\t*\tResume maker [VERSION 1.0.0]\t*\t*\t*\t*\t*");
        System.out.println("\t*\t*\tCopyright © Shubham Prasad. All Rights Reserved\t*\t*");
        System.out.println();
        System.out.println("Please enter the required information below: ");
        System.out.println();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        byte age = sc.nextByte();
        sc.nextLine();

        System.out.print("Enter your highest academic qualification: ");
        String qual = sc.nextLine();

        System.out.print("Enter your gender: ");
        char s = sc.next().charAt(0);
        sc.nextLine();

        String sdo = "", gender = "";

        if (s == 'm' || s == 'M') {
            System.out.print("Son of? ");
            sdo = sc.nextLine();
            gender = "Male";
        } else if (s == 'f' || s == 'F') {
            System.out.print("Daughter of? ");
            sdo = sc.nextLine();
            gender = "Female";
        }

        System.out.print("How much experience do you have (in years)? ");
        byte y = sc.nextByte();
        sc.nextLine();

        System.out.print("How many hobbies do you have? ");
        byte hCount = sc.nextByte();
        sc.nextLine();

        String[] hobby = new String[hCount];
        for (int i = 0; i < hobby.length; i++) {
            System.out.print("Enter hobby no. " + (i + 1) + ": ");
            hobby[i] = sc.nextLine();
        }

        System.out.print("How many interests do you have? ");
        byte iCount = sc.nextByte();
        sc.nextLine();

        String[] interest = new String[iCount];
        for (int j = 0; j < interest.length; j++) {
            System.out.print("Enter interest no. " + (j + 1) + ": ");
            interest[j] = sc.nextLine();
        }

        System.out.print("Enter your date of birth (dd mm yyyy): ");
        byte dd = sc.nextByte();
        byte mm = sc.nextByte();
        short yyyy = sc.nextShort();
        sc.nextLine();

        System.out.println();
        System.out.println("*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
        System.out.println("*\t*\t*\t*\t*\tYour Resume:\t*\t*\t*\t*\t*");
        System.out.println();

        System.out.println("Basic Info: ");
        System.out.println("\tName: " + name);
        System.out.println("\tAge: " + age);
        System.out.println("\tGender: " + gender);

        if (gender.equalsIgnoreCase("male"))
            System.out.print("\tSon of: " + sdo + "\n");
        else if (gender.equalsIgnoreCase("female"))
            System.out.print("\tDaughter of: " + sdo + "\n");

        System.out.println("\tDate of birth: " + dd + ":" + mm + ":" + yyyy);

        System.out.println();

        System.out.println("Work and experience: ");
        System.out.println("\tYears of experience: " + y);
        System.out.println("\tHighest academic qualification: " + qual);

        System.out.println();

        System.out.println("Hobbies and Interests: ");
        if (hCount > 0) {
            System.out.println("\tHobbies: ");
            for (int i = 0; i < hobby.length; i++) {
                System.out.println("\t\t" + (i + 1) + " > " + hobby[i]);
            }
        } else
            System.out.println("\tNo hobbies found....");

        if (iCount > 0) {
            System.out.println("\tInterests: ");
            for (int k = 0; k < interest.length; k++) {
                System.out.println("\t\t" + (k + 1) + " > " + interest[k]);
            }
        } else
            System.out.println("\tNo interests found....");
    }
}
