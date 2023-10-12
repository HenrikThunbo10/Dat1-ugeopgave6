package Task4;

public class Main {

    public static void main(String[] args) {
        Circle Circle1 = new Circle(10);
        Square Square1 = new Square(10, 5);

        Circle1.getArea();
        Square1.getArea();

        System.out.println(Circle1.getArea());
        System.out.println(Square1.getArea());

        Shapebuilder sb = new Shapebuilder();

        sb.addShape(Circle1);
        sb.addShape(Square1);

        System.out.println(sb.getTotalArea());


    }
}
