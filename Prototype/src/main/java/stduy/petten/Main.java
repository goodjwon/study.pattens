package stduy.petten;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Circle circle = new Circle(3,3,4);
        Circle circle1 = circle.copy();

        System.out.println(circle);
        System.out.println(circle1);


    }
}
