import java.util.*;
public class Table2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n,m,i;
        System.out.println("Enter a number:");
        n = in.nextInt();
        System.out.println("Enter a ending point of the table:");
        m = in.nextInt();
        for(i=1;i<=m;i++){
            System.out.println(n*i);
        }
    }
}
