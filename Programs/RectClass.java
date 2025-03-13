class RectClass {
    double length;
    double width;

    RectClass() {
        this.length = 1.0;
        this.width = 1.0;
    }

    RectClass(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double Area() {
        return length * width;
    }

    double Perimeter() {
        return 2 * (length + width);
    }

    
    public static void main(String[] args) {
        RectClass defaultRectangle = new RectClass();
        System.out.println("Default Rectangle:");
        System.out.println("Area: " + defaultRectangle.Area());
        System.out.println("Perimeter: " + defaultRectangle.Perimeter());

        RectClass Rectangle = new RectClass(2.0, 6.0);
        System.out.println("\nParameterized Rectangle:");
        System.out.println("Area: " + Rectangle.Area());
        System.out.println("Perimeter: " + Rectangle.Perimeter());
    }
}
