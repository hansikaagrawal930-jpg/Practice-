public class Number14 {
    public static void main(String[] args) {
        int[] arr = {6,4,2,9,7,5,2};
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]> max){
                max = arr[i];
            }

        }
        System.out.println("the maximum element is:" + max);
    }
    
}
