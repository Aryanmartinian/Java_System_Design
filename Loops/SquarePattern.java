import java.util.*;
public class SquarePattern{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the n:");
        n =in.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}