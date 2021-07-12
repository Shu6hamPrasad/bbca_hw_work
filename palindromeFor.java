import java.util.Scanner;
public class palindromeFor {
    public static int reverse(int input) {
        int rev = 0, rem;
        for (int i = input; i > 0; i /= 10){
            rem = i % 10;
            rev = rev * 10 + rem;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int f0 = sc.nextInt();
        int f1 = reverse(f0);
        if (f0 == f1)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
