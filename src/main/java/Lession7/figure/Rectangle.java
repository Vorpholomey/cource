package Lession7.figure;

public class Rectangle implements PerimeterSquare {
    private double sideA;
    private double sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double perimeter() {
        return sideA * 2 + sideB * 2;
    }

    @Override
    public double square() {
        return sideA * sideB;
    }
}
