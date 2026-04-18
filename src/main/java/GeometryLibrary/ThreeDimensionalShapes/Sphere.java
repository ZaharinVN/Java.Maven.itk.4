package GeometryLibrary.ThreeDimensionalShapes;

public final class Sphere implements Shape3D {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return 4.0 / 3.0 * Math.PI * radius * radius * radius;
    }
}
