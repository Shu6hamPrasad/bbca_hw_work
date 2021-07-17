import java.util.Scanner;

public class tableInfiniteWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int f = sc.nextInt();
        int i = 1;
        while(true) {
            System.out.println(i + " * " + f + " = " + i * f);
            i++;
            System.out.print("Want more? (y/n or Y/N): ");
            char oof = sc.next().charAt(0);
            if (oof == 'n' || oof == 'N')
                break;
        }
    }
}
