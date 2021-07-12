mport java.util.Scanner;
public class krishnamurthyFor {
    public static int f(int input) {
        int f = 1;
        if (input == 1) return f;
        else if (input > 1) {
            for (int i = input; i > 0; i--) f *= i;
        } else return 0;
        return f;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int f = sc.nextInt();
        int sum = 0, digit;
        for (int x = f; x > 0; x /= 10) {
            digit = x % 10;
            int fact = f(digit);
            sum += fact;
        }
        if (sum == f)
            System.out.println("Krishnamurthy Number");
        else
            System.out.println("Not a Krishnamurthy Number");
    }
}
