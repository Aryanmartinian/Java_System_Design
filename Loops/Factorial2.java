import java.util.*;
public class Factorial2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(Sytem.in);
        int n;
        System.out.println("Enter a number:");
        n = in.nextInt();
        int i=1;
        while (n > 0) {
            i = i * n;
            n--;
        }
        System.out.println(i);
    }
}