class Point1{
    int x;
    int y;
}
public class Point{
    public static void main(String[] args){
        Point1 p = new Point1();
        p.x = 5;
        p.y = 10;
        func(p);
        System.out.println(p.x+" "+p.y);

    }
    public static void func(Point1 p){
        p.x = 10;
        p.y=12;
    }
}
