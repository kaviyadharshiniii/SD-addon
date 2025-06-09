package day1;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MAX_SIZE = 100;
        int[] arr = new int[MAX_SIZE];

        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        if (size >= MAX_SIZE) {
            System.out.println("Size exceeds maximum allowed.");
            return;
        }

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter index to insert at: ");
        int index = scanner.nextInt();

        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.print("Enter value to insert: ");
        int value = scanner.nextInt();

        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

       
        arr[index] = value;
        size++;

        System.out.println("Array after insertion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}


		 
		 
		      

		      