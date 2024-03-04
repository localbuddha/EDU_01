package edu03;

public class SumOfDigits {
    //function that finds the sum of digits of a number
    static int findSum(int number) {
//variable that stores the sum
        int sum = 0;
//executes until the condition becomes false
        while (number != 0) {
//finds the last digit from the number and add it to the variable sum
            sum = sum + number % 10;
//removes the last digit
            number = number / 10;
        }
//returns the sum
        return sum;
    }

    //driver code
    public static void main(String args[]) {
        int number = 5678;
//calling the user-defined method and prints the result
        System.out.println("The sum of digits: " + findSum(number));
    }
}
