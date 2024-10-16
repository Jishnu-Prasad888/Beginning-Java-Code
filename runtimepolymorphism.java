class Figure {
    double i, j;

    Figure(double a, double b) {
        this.i = a;
        this.j = b;
    }

    double area() {
        System.out.println("Area for the figure is undefined");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        double area = i * j;
        System.out.println("Area of the rectangle is: " + area);
        return area;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        double area = 0.5 * i * j;
        System.out.println("Area of the triangle is: " + area);
        return area;
    }
}

public class runtimepolymorphism {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 5);

        Figure fref;

        fref = r;
        fref.area(); // This will call the area() method of Rectangle

        fref = t;
        fref.area(); // This will call the area() method of Triangle

        fref = f;
        fref.area(); // This will call the area() method of Figure
    }
}
