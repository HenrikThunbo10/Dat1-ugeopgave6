package Task4;

import java.util.ArrayList;

public class Shapebuilder {

    ArrayList<Shape> ShapeList = new ArrayList<>();

    public void addShape(Shape s) {
        ShapeList.add(s);
    }

    public double getTotalArea() {
        double result = 0;
    for(int i = 0; i < ShapeList.size(); i++) {
        result = ShapeList.get(i).getArea() + result;
    }
    return result;
    }
}
