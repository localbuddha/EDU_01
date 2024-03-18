package edu05.PrTask01;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * This class demonstrates basic operations with arrays in Java, including sorting,
 * calculating the average of numeric values, and searching for specific elements.
 * It uses both linear search and binary search to find elements in an array.
 * <p>
 * The program first sorts and prints an array of names, calculates and prints the average
 * of an array of numbers, and then prompts the user to search for specific names in the
 * sorted array of names using both linear search and binary search methods.
 * <p>
 * Note: The binary search requires the array to be sorted before searching.
 */
public class PrTask01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        String[] names = {"Bob", "Alice", "Jack"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        double[] numbers = {1, 2, 2.5, 3, 5};
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("The average value is : " + average);

        System.out.print("Enter the name to search: ");
        String nameToSearch = scan.nextLine();
        boolean found = false;
        for (var name : names) {
            if (name.equals(nameToSearch)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The name '" + nameToSearch + "' is on the list");
        } else {
            System.out.println("The name '" + nameToSearch + "' is not found");
        }
        System.out.print("Enter the name to search: ");
        nameToSearch = scan.nextLine();
        Arrays.sort(names); // binarySearch does not work for non sorted arrays!!!
        int ix = Arrays.binarySearch(names, nameToSearch);
        if (ix >= 0) {
            System.out.println("The name '" + nameToSearch + "' is on the list");
        } else {
            System.out.println("The name '" + nameToSearch + "' is not found");
        }
        System.out.println("Debug info: int ix = " + ix);
    }
}
