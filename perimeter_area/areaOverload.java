package perimeter_area;

abstract class areaOverload {
    public static double area(double radius) { // circle
        return (Math.PI * Math.pow(radius, 2));
    }

    public static double area(double side, char indicator) { // square
        return (Math.pow(side, 2));
    }

    public static double area(double side1, double side2) { // rectangle
        return (side1 * side2);
    }

    public static double area(double base, double height, char indicator) { // triangle
        return (0.5 * base * height);
    }
}
