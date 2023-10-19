package OOP;

public class Circle1 {
    private double radius; //data field or data member
    //instance VS static data field
    private static int numberOfObjects;

    // A static variable is shared by all objects of the class.
    // A static method cannot access instance members
    // (i.e., instance data fields and methods) of the class.
    public Circle1() { //no-argument constructor = default constructor
        //radius = 1;
        numberOfObjects++;
    }

    public Circle1(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public static void main(String[] args) {
        System.out.println("The number of Circle objects is " +
                Circle1.getNumberOfObjects());
        System.out.println("-----------------------------------------");
        Circle1 c1 = new Circle1();
        System.out.println("c1.getRadius() = " + c1.getRadius());
        System.out.println("c1.getArea() = " + c1.getArea());
        System.out.println("c1.getPerimeter() = " + c1.getPerimeter());
        System.out.println("The number of Circle objects is " +
                Circle1.getNumberOfObjects());
        System.out.println("-----------------------------------------");
        Circle1 c2 = new Circle1(25);
        System.out.println("c2.getRadius() = " + c2.getRadius());
        System.out.println("c2.getArea() = " + c2.getArea());
        System.out.println("c2.getPerimeter() = " + c2.getPerimeter());
        System.out.println("The number of Circle objects is " +
                Circle1.getNumberOfObjects());
        System.out.println("-----------------------------------------");
        // Passing Objects to Methods
        // Passing an object to a method is to pass a copy of the reference to the object.
        // any modifications to the data members through this reference inside the
        // function will affect the original object.
        // Assigning a new reference to the formal parameter will not affect the original object.
        Circle1 myCircle = new Circle1(10);
        printCircle(myCircle);
        modifyRadius(myCircle);
        System.out.println("myCircle.getRadius() = " + myCircle.getRadius());
        modifyCircle(myCircle);
        System.out.println("myCircle.getRadius() = " + myCircle.getRadius());
    }

    public static void printCircle(Circle1 c) {
        System.out.println("The area of the circle of radius "
                + c.getRadius() + " is " + c.getArea());
    }

    public static void modifyRadius(Circle1 c) {
        c.setRadius(15);
    }

    public static void modifyCircle(Circle1 c) {
        c.setRadius(20);
        c = new Circle1(100);
        c.setRadius(30);
        System.out.println("The radius value from in inside the function = " +
                c.getRadius());
    }
}
/*
The default value of a data field is null for a reference type, 0 for a numeric type, false
for a boolean type, and \u0000 for a char type. However, Java assigns no default value to
a local variable inside a method
 */