import java.util.Scanner;
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the password");
        String p = sc.nextLine();
        if(p.equals("Hansika123")){
            System.out.println("Access granted");
        }
        else{
            System.out.println("access denied");
        }
    }
}
