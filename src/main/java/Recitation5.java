import java.util.Scanner;

public class Recitation5 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Set starting point of x: ");
        double userx = scan.nextDouble();
        System.out.println("Set starting point of Y: ");
        double usery = scan.nextDouble();
        Point location = new Point(userx,usery);
        Circle circle16 = new Circle(location,16.0);
        Point location2 = new Point(14,12);
        Circle circle40 = new Circle(location2, 40.0);
        if (circle16.intersects(circle40)){
            System.out.println("Circles intersect!");
        }
        else{
            System.out.println("Circles do not intersect!");
        }

        return;
    }
}
