package edu03;

public class PrTask01 {

    public static void main(String[] args) {
        double x = 0;
        System.out.println(calculateSquareRoot(x));
        calculateSquareRoot(x);
        calculateSquare(x);
        calculateCube(x);
    }

    public static double calculateSquareRoot(double x) {
        return Math.sqrt(x);
    }

    public static double calculateSquare(double x) {
        return (x * x);
    }

    public static double calculateCube(double x) {
        return x * x * x;
    }
}
