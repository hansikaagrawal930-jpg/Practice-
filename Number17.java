import java.util.Arrays;
public class Number17 {
    public static void main(String[] args) {
        int[] arr = {-5,-2,7,2,0,7,2};
        System.out.println("Original arrays:" + Arrays.toString(arr));
        int n = arr.length;
         for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // assume current index has the smallest element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // update minIndex if smaller element found
                }
            }

            // swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("After selection sort: " + Arrays.toString(arr));
    }
    
}
