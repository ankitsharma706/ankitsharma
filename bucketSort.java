
import java.util.ArrayList;
import java.util.Collections;

public class bucketSort {
    public static void bucketSort(int arr[], int k) {
        int n = arr.length;
        int max_val = arr[0];

        // Finding the maximum value in the array
        for (int i = 1; i < n; i++) {
            max_val = Math.max(max_val, arr[i]);
        }
        max_val++;

        // Creating buckets using an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> bkt = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            bkt.add(new ArrayList<>());
        }

        // Placing elements into respective buckets
        for (int i = 0; i < n; i++) {
            int bi = (k * arr[i]) / max_val;
            bkt.get(bi).add(arr[i]);
        }

        // Sorting individual buckets
        for (int i = 0; i < k; i++) {
            Collections.sort(bkt.get(i));
        }

        // Merging the buckets to the original array
        int index = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < bkt.get(i).size(); j++) {
                arr[index++] = bkt.get(i).get(j);
            }
        }
    }

    public static void main(String[] args) {
        // Example usage of bucketSort method
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int k = 5; // Number of buckets

        bucketSort(arr, k);

        // Print the sorted array
        System.out.println("Array after Bucket Sort:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~O(nLOGn)~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
