import java.util.Arrays;

public class Number18 {
    public static void main(String[] args) {
        int[] arr = {-5, -2, 7, 2, 0, 7, 2};
        System.out.println("Original array: " + Arrays.toString(arr));

        int n = arr.length;

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = arr[i];   // take one element (the "card")
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, one step ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key at its correct position
            arr[j + 1] = key;
        }

        System.out.println("After insertion sort: " + Arrays.toString(arr));
    }
}
