package GeometryApp;

import GeometryLibrary.GeometryLibrary.Circle;
import GeometryLibrary.GeometryLibrary.Rectangle;
import GeometryLibrary.GeometryLibrary.Shape2D;
import GeometryLibrary.GeometryLibrary.Triangle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape2D> shapes = List.of(
                new Circle(5),
                new Rectangle(10, 12),
                new Triangle(7, 8, 6)
        );

        for (Shape2D shape : shapes) {
            System.out.printf("%s -> area=%.2f, perimeter=%.2f%n",
                    shape.getClass().getSimpleName(),
                    shape.area(),
                    shape.perimeter());
        }
    }
}
