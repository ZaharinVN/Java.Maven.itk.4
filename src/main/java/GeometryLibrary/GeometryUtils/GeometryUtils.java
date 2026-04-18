package GeometryLibrary.GeometryUtils;

import GeometryLibrary.GeometryLibrary.Shape2D;

public final class GeometryUtils {
    private GeometryUtils() {
    }

    public static double cmToMm(double cm) {
        return cm * 10;
    }

    public static double mmToCm(double mm) {
        return mm / 10;
    }

    public static boolean sameArea(Shape2D first, Shape2D second, double epsilon) {
        return Math.abs(first.area() - second.area()) < epsilon;
    }
}
