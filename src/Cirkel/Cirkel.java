package Cirkel;

public class Cirkel {
    double radius;

    public Cirkel(double radius) throws IllegalArgumentException{


            if (radius > 0) {
                this.radius = radius;
            } else {
                throw new IllegalArgumentException("Negative number");
            }
    }

    public double area() {

        return Math.PI*radius*radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Negative number");
        }
    }
}
