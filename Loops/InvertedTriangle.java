import java.util.*;
public class InvertedTriangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter a n:");
        n = in.nextInt();
        for(i=n;i>0;i--){
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
