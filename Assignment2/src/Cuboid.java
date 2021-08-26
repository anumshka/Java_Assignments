public class Cuboid implements Shape3D {

    double length, breadth, height;

    public double getHeight() {
        return height;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getLength() {
        return length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public double getArea() throws InvalidException {
        if (length < 0 || breadth < 0 || height < 0) {
            throw new InvalidException("Negative Inputs not allowed!!");
        }
        return 2 * (length * breadth + breadth * height + height * length);
    }

    @Override
    public double getVolume() throws InvalidException {
        if (length < 0 || breadth < 0 || height < 0) {
            throw new InvalidException("Negative Inputs not allowed!!");
        }
        return length * breadth * height;
    }

    @Override
    public void print() throws InvalidException {
        System.out.println("Volume:" + getVolume());
        System.out.println("Area:" + getArea());

    }
}
