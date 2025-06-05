package day1;
import java.util.Scanner;
	public class task2 {
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int size = scanner.nextInt();

	        int[] arr = new int[size];

	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        int max = arr[0];
	        int min = arr[0];

	        for (int i = 1; i < size; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);

	        scanner.close();
	    }
	}
