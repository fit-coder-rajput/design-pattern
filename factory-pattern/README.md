Motivation
In software design, we often face scenarios where a system needs to create instances of various classes. For example, imagine you are building a graphical application where different shapes, such as circles, rectangles, and triangles, are created dynamically based on user input. The naive approach would involve hard-coding the creation of these shapes, but this approach can lead to several issues:

Tight Coupling: The code that creates objects is tightly coupled with the classes of the objects. If you need to add new types of shapes or change existing ones, you'd have to modify the existing code, making it less maintainable.

Complexity: As the number of shapes increases, the code responsible for creating them becomes cluttered and difficult to manage.

Duplication: If the object creation logic is complex (e.g., setting initial values or performing checks), it may be repeated in multiple places.

The Factory Pattern addresses these issues by providing a way to delegate the responsibility of object creation to a separate component, called the factory. This approach leads to more flexible, maintainable, and reusable code.

Factory Pattern Explanation
The Factory Pattern is a creational design pattern that defines an interface for creating objects but allows subclasses to alter the type of objects that will be created. It decouples the client code from the actual implementation classes, enabling easier maintenance and extension.

Structure of the Factory Pattern
Product: This is the interface or abstract class that defines the object type that the factory method will create. For example, Shape could be a product interface in a graphical application.

Concrete Products: These are specific implementations of the Product interface. For example, Circle, Rectangle, and Triangle are concrete products that implement the Shape interface.

Creator (Factory): This is an abstract class or interface that declares the factory method, which returns an object of type Product. It may also contain some default implementation that calls the factory method.

Concrete Creator: This is a subclass that overrides the factory method to return an instance of a specific Concrete Product. Each concrete creator corresponds to a specific product.

Example: Factory Pattern in Java (other example apart from code files)
Let's implement a simple example of the Factory Pattern where we create different types of shapes.

--------------------
// The Product interface
public interface Shape {
    void draw();
}
-----------------------

// Concrete Product: Circle
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Concrete Product: Rectangle
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Concrete Product: Triangle
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}
--------------------------------------------------------

// The Creator (Factory)
public abstract class ShapeFactory {
    // Factory method to create a Shape object
    public abstract Shape createShape();
}

---------------------------------------------------------

// Concrete Creator: CircleFactory
public class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}

// Concrete Creator: RectangleFactory
public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}

// Concrete Creator: TriangleFactory
public class TriangleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Triangle();
    }
}
----------------------------------------------------------

public class Main {
    public static void main(String[] args) {
        // Create a factory for each shape
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();
        ShapeFactory triangleFactory = new TriangleFactory();

        // Use the factories to create shapes
        Shape circle = circleFactory.createShape();
        Shape rectangle = rectangleFactory.createShape();
        Shape triangle = triangleFactory.createShape();

        // Draw the shapes
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
---------------------------------------------------------------