import java.util.*;
public class Test5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        System.out.println(firstDigit(n));

    }
    public static int firstDigit(int n){
        double power = Math.log10(n);
        int p = (int)power;
        double a = Math.pow(10,p);
        double answer = n/a;
        return (int) answer;
    }
}

