package edu05;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arrNumbers = {15, -10, 4, 1, 5, 7, 4, -3, -8, 12, 17};
        int sum = 0;
        for (int arrNumber : arrNumbers) {
            sum += arrNumber;
        }
        System.out.println("Sum is " + sum);
    }
}
