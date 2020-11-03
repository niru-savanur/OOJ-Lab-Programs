import java.util.Scanner;
import java.lang.Math;

abstract class Shape {
    int c, d;

    Shape(int a, int b) {
        this.c = a;
        this.d = b;
    }

    Shape(int a) {
        this.c = a;

    }

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int a, int b) {
        super(a, b);
    }

    void printArea() {
        System.out.println("Area of rectangle is: " + c * d);
    }
}

class Triangle extends Shape {
    Triangle(int a, int b) {
        super(a, b);
    }

    void printArea() {
        System.out.println("Area of triangle is: " + c * d / 2);
    }
}

class Circle extends Shape {
    Circle(int a) {
        super(a);
    }

    void printArea() {
        System.out.println("Area of circle is: " + Math.PI * Math.pow(c, 2));
    }
}

public class shapeMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Shape s;
        Rectangle r = new Rectangle(4, 10);
        Triangle t = new Triangle(6, 3);
        Circle c = new Circle(3);
        s = r;
        s.printArea();
         s = t;
        s.printArea();
         s = c;
        s.printArea();
    }
}
