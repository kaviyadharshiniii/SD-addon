package day2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to hold the elements
        int[] array = new int[n];

        // Get the elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Reverse the array using the two-pointer technique
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Swap the elements at the left and right pointers
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Close the scanner
        scanner.close();
    }
}