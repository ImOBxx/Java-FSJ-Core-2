

class Rectangle41 {
    // Data members for length and breadth
    protected int length;
    protected int breadth;

    // Constructor to initialize length and breadth
    public Rectangle41(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and print the area
    public void printArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }

    // Method to calculate and print the perimeter
    public void printPerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }
}

// Derived class Square inheriting from Rectangle
class Square41 extends Rectangle41 {
    // Constructor to initialize side of the square
    public Square41(int side) {
        super(side, side);
    }
}

// Main class to test the functionality
public class Main23 {
    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle41 rect = new Rectangle41(5, 10);
        System.out.println("Rectangle:");
        rect.printArea(); // Output the area of the rectangle
        rect.printPerimeter(); // Output the perimeter of the rectangle

        // Creating a Square object
        Square41 sq = new Square41(7);
        System.out.println("Square:");
        sq.printArea(); // Output the area of the square
        sq.printPerimeter(); // Output the perimeter of the square
    }
}
