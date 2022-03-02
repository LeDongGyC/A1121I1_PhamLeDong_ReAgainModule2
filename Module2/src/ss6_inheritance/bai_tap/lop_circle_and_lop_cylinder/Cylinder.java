package ss6_inheritance.bai_tap.lop_circle_and_lop_cylinder;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder with height = " + this.getHeight() + " which is subclass of " + super.toString();
    }
}
