public class Circle implements Shape2D {

    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() throws InvalidException {
        if (radius < 0)
            throw new InvalidException("Negative Inputs not allowed!!");
        return Math.PI + radius * radius;
    }

    public double getPerimeter() throws InvalidException {
        if (radius < 0)
            throw new InvalidException("Negative Inputs not allowed!!");
        return 2 * Math.PI * radius;
    }

    public void print() throws InvalidException {
        System.out.println("Perimeter:" + getPerimeter());
        System.out.println("Area:" + getArea());
    }

}
