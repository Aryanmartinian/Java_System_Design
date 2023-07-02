import java.util.*; // Printing the table using while loop
public class Table1 {
    public static void main(String args[]){
       // System.out.println("Hello World");
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter a number:");
        n = in.nextInt();
        int i=1;
        while(i<11){
            System.out.println(i*n);
            i++;
        }
    }
}