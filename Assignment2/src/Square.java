public class Square implements Shape2D {

    double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() throws InvalidException {
        if (side < 0) {
            throw new InvalidException("Negative Inputs not allowed!!");
        }
        return side * side;
    }

    @Override
    public double getPerimeter() throws InvalidException {
        if (side < 0) {
            throw new InvalidException("Negative Inputs not allowed!!");
        }
        return 4 * side;
    }

    @Override
    public void print() throws InvalidException {
        System.out.println("Perimeter:" + getPerimeter());
        System.out.println("Area:" + getArea());
    }
}
