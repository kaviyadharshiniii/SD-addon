package day8;

import java.util.Scanner;

public class post_ass8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter target to count: ");
        int target = sc.nextInt();

     
        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        if (first == -1)
            System.out.println("Target not found.");
        else
            System.out.println("Frequency: " + (last - first + 1));

        sc.close();
    }
    static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; 
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return result;
    }

    static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; 
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return result;
    }
}
