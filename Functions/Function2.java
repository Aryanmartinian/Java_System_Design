public class Function2 {
    public static void main(String[] args){
        System.out.println("Main Begins");
        func1();
        System.out.println("Main Ends");
    }
    public static void func1(){
        System.out.println("Inside func1");
        func2();
    }
    public static void func2(){
        System.out.println("Inside func2");
    }
}
