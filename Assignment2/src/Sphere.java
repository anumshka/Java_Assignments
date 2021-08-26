public class Sphere implements Shape3D {

    double radius;

    //getter and setter methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() throws InvalidException {
        if (radius < 0) {
            throw new InvalidException("Negative Inputs not allowed!!");
        }
        return 4 * Math.PI * (radius * radius);
    }


    @Override
    public double getVolume() throws InvalidException {
        if (radius < 0) {
            throw new InvalidException("Negative Inputs not allowed!!");
        }
        return ((double) 4 / 3) * Math.PI * (radius * radius * radius);
    }

    @Override
    public void print() throws InvalidException {
        System.out.println("Volume:" + getVolume());
        System.out.println("Area:" + getArea());

    }
}
