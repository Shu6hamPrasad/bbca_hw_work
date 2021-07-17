import java.util.Scanner;

public class tableInfinite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.print("Enter a number: ");
        int f = sc.nextInt();
        for (; ; ) {
            System.out.println(i + " * " + f + " = " + i * f);
            i++;
            System.out.print("Want more? (y/n or Y/N): ");
            char oof = sc.next().charAt(0);
            if (oof == 'n' || oof == 'N')
                break;
        }
    }
}
