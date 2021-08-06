package perimeter_area;

abstract class perimeterOverload {
    public static double perimeter(double circumference) { // circle
        return (2 * Math.PI * circumference);
    }

    public static double perimeter(double side, char indicator) { // square
        return (4 * side);
    }

    public static double perimeter(double side1, double side2) { // rectangle
        return (2 * (side1 + side2));
    }

    public static double perimeter(double side1, double side2, double side3) { // triangle
        return (side1 + side2 + side3);
    }
}
