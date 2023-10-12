package Task4;

public class Square implements Shape{

    double width;
    double height;

    public Square(double width, double height){
    this.width = width;
    this.height = height;

    }

    @Override
    public double getArea() {

        return width*height;

    }
}
