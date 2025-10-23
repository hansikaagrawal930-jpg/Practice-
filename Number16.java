// Arrays.toString(arr)
import java.util.Arrays;

public class Number16 {
    public static void main(String[] args) {
        int[] arr = {-5, -2, 7, 2, 0, 7, 2};
        System.out.println("Original array: " + Arrays.toString(arr));

        int n = arr.length;
        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
