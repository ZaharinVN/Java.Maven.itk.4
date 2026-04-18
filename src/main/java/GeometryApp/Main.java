package GeometryApp;

import GeometryLibrary.GeometryLibrary.Circle;
import GeometryLibrary.GeometryLibrary.Rectangle;
import GeometryLibrary.GeometryLibrary.Shape2D;
import GeometryLibrary.GeometryLibrary.Triangle;
import GeometryLibrary.GeometryUtils.GeometryUtils;
import GeometryLibrary.ThreeDimensionalShapes.Cube;
import GeometryLibrary.ThreeDimensionalShapes.Shape3D;
import GeometryLibrary.ThreeDimensionalShapes.Sphere;

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
        List<Shape3D> shapes3D = List.of(
                new Cube(3),
                new Sphere(4)
        );

        for (Shape3D shape : shapes3D) {
            System.out.printf("%s -> surface=%.2f, volume=%.2f%n",
                    shape.getClass().getSimpleName(), shape.surfaceArea(), shape.volume());
        }

        System.out.println("10 cm in mm = " + GeometryUtils.cmToMm(10));
    }
    }

