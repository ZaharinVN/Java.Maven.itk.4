package GeometryLibrary.ThreeDimensionalShapes;

public final class Cube implements Shape3D {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
