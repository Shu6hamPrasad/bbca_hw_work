package perimeter_area;

import java.util.Scanner;

public class mainOverloadProject extends inputs {

    public static void localInput() {
        System.out.print("Enter a choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        input(choice);
        sc.close();
    }

    public static void main(String[] args) {
        System.out.println("Menu ");
        System.out.println("1> Circumference of Circle");
        System.out.println("2> Perimeter of Square");
        System.out.println("3> Perimeter of Rectangle");
        System.out.println("4> Perimeter of Triangle");
        System.out.println("5> Area of Circle");
        System.out.println("6> Area of Square");
        System.out.println("7> Area of Rectangle");
        System.out.println("8> Area of Triangle");
        localInput();
    }
}
