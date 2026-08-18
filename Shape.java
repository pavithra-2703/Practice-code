// Abstraction: Shape is abstract, cannot be instantiated directly
public abstract class Shape {
    private String color;   // Encapsulation: private field

    public Shape(String color){   // Encapsulation: constructor initializes private field
        this.color=color;
    }

    public String setColor() {    // Misnamed: should be getColor() → still Encapsulation
        return color;
    }

    public abstract double calculateArea(); // Abstraction: subclasses must implement
}

// Inheritance: Circle extends Shape
public class Circle extends Shape {
    private double radius;   // Encapsulation

    public Circle(String color, double radius) {
        super(color);        // Inheritance: calling parent constructor
        this.radius = radius;
    }

    @Override
    public double calculateArea() {   // Polymorphism: overriding abstract method
        return Math.PI * radius * radius;
    }
}

// Inheritance: Rectangle extends Shape
public class Rectangle extends Shape {
    private double width;    // Encapsulation
    private double height;   // Encapsulation

    public Rectangle(String color, double width, double height) {
        super(color);        // Inheritance
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea(){    // Polymorphism: overriding abstract method
        return width*height;
    }
}

// Demonstration of Polymorphism (runtime method dispatch)
public class Practice{
    public static void main(String[] args){

    }
}
