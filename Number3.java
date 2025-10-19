import java.util.Scanner;
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter a number");
        int a = sc.nextInt();
        if (a%2==0){
            System.err.println("even number");
        }
        else{
            System.out.println("odd number");
        }

    }
    
}
