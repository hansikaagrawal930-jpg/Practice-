import java.util.Scanner;
public class Number13 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i=0; i<7; i++){
            arr[i] = sc.nextInt();

        }
        System.out.print("the array elements are:");
        for (int a= 0; a<7; a++){
            
            System.out.print(arr[a] + " ");
        }

        
    }
}
