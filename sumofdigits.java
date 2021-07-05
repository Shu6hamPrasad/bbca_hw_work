import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int range = sc.nextInt();
        int i = 0,j = 0;
        while (range > 0){
            if (range % 2 == 0)
                i++;
            else
                j++;
            range --;
        }
        System.out.println("Odd: " + j + " Even:" + i);
    }
}
