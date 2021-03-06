public class Cylinder implements Shape3D {

    double height, radius;

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() throws InvalidException {

        if (radius < 0 || height < 0) {
            throw new InvalidException("Negative Inputs not allowed!!");
        }
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double getVolume() throws InvalidException {
        if (radius < 0 || height < 0) {
            throw new InvalidException("Negative Inputs not allowed!!");
        }
        return Math.PI * radius * radius * height;
    }

    @Override
    public void print() throws InvalidException {
        System.out.println("Volume:" + getVolume());
        System.out.println("Area:" + getArea());

    }
}
