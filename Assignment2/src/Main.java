import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Triangle");
            System.out.println("4. Rectangle");
            System.out.println("5. Sphere");
            System.out.println("6. Cuboid");
            System.out.println("7. Cylinder");
            System.out.println("8. Exit");
            System.out.println("Enter your Choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Circle circle = new Circle();
                    System.out.println("You chose circle!");
                    System.out.println("Enter the radius of the circle");
                    double radius = sc.nextDouble();
                    circle.setRadius(radius);
                    try {
                        circle.print();
                    } catch (InvalidException e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    Square square = new Square();
                    System.out.println("You chose Square!");
                    System.out.println("Enter the side of the square");
                    double side = sc.nextDouble();
                    square.setSide(side);
                    try {
                        square.print();
                    } catch (InvalidException e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    Triangle triangle = new Triangle();
                    System.out.println("You chose triangle!");
                    System.out.println("Enter the first side");
                    double side1 = sc.nextDouble();
                    System.out.println("Enter the first side");
                    double side2 = sc.nextDouble();
                    System.out.println("Enter the first side");
                    double side3 = sc.nextDouble();
                    triangle.setSide1(side1);
                    triangle.setSide1(side2);
                    triangle.setSide1(side3);
                    try {
                        triangle.print();
                    } catch (InvalidException e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    Rectangle rectangle = new Rectangle();
                    System.out.println("You chose rectangle!");
                    System.out.println("Enter the length of the rectangle");
                    double length = sc.nextDouble();
                    System.out.println("Enter the breadth of the rectangle");
                    double breadth = sc.nextDouble();
                    rectangle.setLength(length);
                    rectangle.setBreadth(breadth);
                    try {
                        rectangle.print();
                    } catch (InvalidException e) {
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    Sphere sphere = new Sphere();
                    System.out.println("You chose sphere!");
                    System.out.println("Enter the radius of the sphere");
                    double radiusSphere = sc.nextDouble();
                    sphere.setRadius(radiusSphere);
                    try {
                        sphere.print();
                    } catch (InvalidException e) {
                        e.printStackTrace();
                    }
                    break;

                case 6:
                    Cuboid cuboid = new Cuboid();
                    System.out.println("You chose cuboid!");
                    System.out.println("Enter the length of the cuboid");
                    double lengthCuboid = sc.nextDouble();
                    System.out.println("Enter the breadth of the cuboid");
                    double breadthCuboid = sc.nextDouble();
                    System.out.println("Enter the height of the cuboid");
                    double heightCuboid = sc.nextDouble();
                    cuboid.setHeight(heightCuboid);
                    cuboid.setBreadth(breadthCuboid);
                    cuboid.setLength(lengthCuboid);
                    try {
                        cuboid.print();
                    } catch (InvalidException e) {
                        e.printStackTrace();
                    }
                    break;

                case 7:
                    Cylinder cylinder = new Cylinder();
                    System.out.println("You chose cylinder!");
                    System.out.println("Enter the height of the cylinder");
                    double heightCylinder = sc.nextDouble();
                    System.out.println("Enter the radius of the cylinder");
                    double radiusCylider = sc.nextDouble();
                    try {
                        cylinder.print();
                    } catch (InvalidException e) {
                        e.printStackTrace();
                    }
                    break;

                case 8:
                    System.out.println("You chose to exit");
                    System.exit(0);
                    break;

                default:
                    try {
                        throw new InvalidException("This is not a valid choice!");
                    } catch (InvalidException e) {
                        e.printStackTrace();
                    }
            }
        }
        while (choice != 9);
    }
}


