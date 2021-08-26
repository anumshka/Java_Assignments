public class Rectangle implements Shape2D {

    double length, breadth;

    //getter and setter methods
    public double getBreadth() {
        return breadth;
    }

    public double getLength() {
        return length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() throws InvalidException {
        if (length < 0 || breadth < 0) {
            throw new InvalidException("Negative Inputs not allowed!!");
        }
        return length * breadth;
    }

    @Override
    public double getPerimeter() throws InvalidException {
        if (length < 0 || breadth < 0) {
            throw new InvalidException("Negative Inputs not allowed!!");
        }
        return 2 * (length + breadth);
    }

    @Override
    public void print() throws InvalidException {
        System.out.println("Perimeter:" + getPerimeter());
        System.out.println("Area:" + getArea());
    }
}
