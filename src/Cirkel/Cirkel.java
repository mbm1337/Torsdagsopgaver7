package Cirkel;

public class Cirkel {
    double radius;

    public Cirkel(int radius){

            if (radius > 0) {
                this.radius = radius;
            } else {
                throw new IllegalArgumentException("Negative number");
            }
    }

    public double area() {
        return Math.PI*radius*radius;
    }
}
