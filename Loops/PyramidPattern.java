import java.util.*;
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter a n:");
        n = in.nextInt();
        for(i=0;i<n;i++){ // to handle outer loops
            for(j=2*(n-1);j>=0;j++){ // inner loop to print whitespaces
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}