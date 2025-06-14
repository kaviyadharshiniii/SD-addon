package day7;
import java.util.*;
public class main_prg7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Arrays.stream(arr).max().getAsInt();
        List<Integer>[] buckets = new ArrayList[max + 1];

        for (int i = 0; i <= max; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int num : arr) {
            buckets[num].add(num);
        }
        System.out.println("Sorted array:");
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
