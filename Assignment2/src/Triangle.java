public class Triangle implements Shape2D {

    double side1, side2, side3;

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() throws InvalidException {
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new InvalidException("Negative Inputs not allowed!!");
        } else if ((side1 + side2 <= side3)
                || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
            throw new InvalidException("Its not a triangle!");
        }
        double S = (side1 + side2 + side3) / 2;

        // Finding the area of the triangle
        return Math.sqrt(S * (S - side1) * (S - side2)
                * (S - side3));
    }


    @Override
    public double getPerimeter() throws InvalidException {
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new InvalidException("Negative Inputs not allowed!!");
        } else if ((side1 + side2 <= side3)
                || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
            throw new InvalidException("Its not a triangle!");
        }
        double S = (side1 + side2 + side3) / 2;

        // Finding the area of the triangle
        return side1 + side2 + side3;
    }

    public void print() throws InvalidException {
        System.out.println("Perimeter:" + getPerimeter());
        System.out.println("Area:" + getArea());
    }
}
