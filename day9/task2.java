package day9;
import java.util.Arrays;
import java.util.Scanner;

public class task2 {
   
    public static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        int index = upperBound(arr, target);
        System.out.println("Upper bound index: " + index);

        if (index < n) {
            System.out.println("Value at upper bound: " + arr[index]);
        } else {
            System.out.println("No element greater than the target.");
        }
    }
}
