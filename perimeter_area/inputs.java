package perimeter_area;

import java.util.Scanner;

abstract class inputs {
    public static void input(int choice) {
        Scanner sc = new Scanner(System.in);
        switch (choice) {

            // perimeter starts here

            case 1: {
                System.out.println("Enter the radius: ");
                double radius = sc.nextDouble();
                System.out.println("The circumference is: " + perimeterOverload.perimeter(radius));
                break;
            }
            case 2: {
                System.out.println("Enter the length of a side: ");
                double side = sc.nextDouble();
                System.out.println("The perimter is: " + perimeterOverload.perimeter(side, 'a'));
                break;
            }
            case 3: {
                System.out.println("Enter the length of 1st Side: ");
                double side1 = sc.nextDouble();
                System.out.println("Enter the length of 2nd Side: ");
                double side2 = sc.nextDouble();
                System.out.println("The perimeter is: " + perimeterOverload.perimeter(side1, side2));
                break;
            }
            case 4: {
                System.out.println("Enter the length of Base: ");
                double side1 = sc.nextDouble();
                System.out.println("Enter the length of Height: ");
                double side2 = sc.nextDouble();
                System.out.println("Enter the length of Hypotenuse: ");
                double side3 = sc.nextDouble();
                System.out.println("The perimeter is: " + perimeterOverload.perimeter(side1, side2, side3));
                break;
            }

            // area starts here

            case 5: {
                System.out.println("Enter the radius: ");
                double radius = sc.nextDouble();
                System.out.println("The area is: " + areaOverload.area(radius));
                break;
            }
            case 6: {
                System.out.println("Enter the length of a side: ");
                double side = sc.nextDouble();
                System.out.println("The area is: " + areaOverload.area(side, 'a'));
                break;
            }
            case 7: {
                System.out.println("Enter the length of 1st Side: ");
                double side1 = sc.nextDouble();
                System.out.println("Enter the length of 2nd Side: ");
                double side2 = sc.nextDouble();
                System.out.println("The area is: " + areaOverload.area(side1, side2));
                break;
            }
            case 8: {
                System.out.println("Enter the length of Base: ");
                double side1 = sc.nextDouble();
                System.out.println("Enter the length of Height: ");
                double side2 = sc.nextDouble();
                System.out.println("The area is: " + areaOverload.area(side1, side2, 'a'));
                break;
            }

            default: {
                System.out.print("Sorry, you entered a wrong input, do you want to try again? (y / n or Y / N): ");
                char c = sc.next().charAt(0);
                if (c == 'y' || c == 'Y' || c == '\n')
                    mainOverloadProject.localInput();
                else 
                    System.exit(0);
            }
        }
        sc.close();
    }
}
