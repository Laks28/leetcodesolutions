package leetcodesolutions.Arrays;

import java.util.Random;

/**
 * Program to demonstrate two approaches to rotate an array:
 * 1. Brute Force
 * 2. Reversal Algorithm
 */
public class RotateArray {

    public static void main(String[] args) {
        // Define array size and number of rotations
        int arraySize = 5;
        int noOfRotations = 4;

        // Generate a random array
        int[] arr = generateRandomArray(arraySize);

        System.out.println("Initial Array:");
        printArray(arr);

        // Brute Force Rotation
        long startTime = System.nanoTime();
        rotateArrayByBruteForce(arr.clone(), noOfRotations);
        long endTime = System.nanoTime();
        System.out.println("Array after " + noOfRotations + " rotations (Brute Force):");
        printArray(arr);
        System.out.println("Time taken (Brute Force): " + (endTime - startTime) + " nanoseconds");

        // Reversal Algorithm Rotation
        startTime = System.nanoTime();
        rotateArrayByReversing(arr, noOfRotations);
        endTime = System.nanoTime();
        System.out.println("Array after " + noOfRotations + " rotations (Reversal Algorithm):");
        printArray(arr);
        System.out.println("Time taken (Reversal Algorithm): " + (endTime - startTime) + " nanoseconds");
    }

    /**
     * Prints the array.
     *
     * @param arr the array to print
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Rotates an array by brute force (one element at a time).
     *
     * @param arr the array to rotate
     * @param k   number of rotations
     */
    public static void rotateArrayByBruteForce(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        for (int i = 0; i < k; i++) {
            // Move the last element to the front
            int lastValue = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = lastValue;
        }
    }

    /**
     * Reverses elements of an array between two indices.
     *
     * @param arr   the array to reverse
     * @param start starting index
     * @param end   ending index
     */
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) { // Fixed `start > end` issue
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    /**
     * Rotates an array using the reversal algorithm.
     *
     * @param arr the array to rotate
     * @param k   number of rotations
     */
    public static void rotateArrayByReversing(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        // Reverse the first part
        reverse(arr, 0, k - 1);
        // Reverse the second part
        reverse(arr, k, n - 1);
        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    /**
     * Generates an array of random integers.
     *
     * @param size the size of the array
     * @return the generated random array
     */
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100); // Limiting values to 0-99 for readability
        }
        return arr;
    }
}
