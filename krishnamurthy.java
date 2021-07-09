import java.util.Scanner;

public class krishnamurthy {
    public static int f(int n) {
        int out = 1;
        if (n == 1)
            return out;
        else if (n == 0)
            return 0;
        else {
            int i = n;
            while (i >= 1) {
                out *= i;
                i--;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int k = sc.nextInt();
        int dupe = k;
        int rem;
        int fact = 0;
        while (k != 0) {
            rem = k % 10;
            fact += f(rem);
            k /= 10;
        }
        if (dupe == fact)
            System.out.println("Krishnamurthy Number");
        else
            System.out.println("Not a Krishnamurthy Number");
    }
}
