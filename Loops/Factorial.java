import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n,fact=1,i;
        System.out.println("Enter the number:");
        n = in.nextInt();
        for(i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of a number is:"+fact);
    }
}