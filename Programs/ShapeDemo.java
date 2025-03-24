interface Shape {
    double calculateArea();
}

class Triangle implements Shape {
    private double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class Rectangle implements Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape triangle = new Triangle(10, 5);
        Shape rectangle = new Rectangle(8, 4);

        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
