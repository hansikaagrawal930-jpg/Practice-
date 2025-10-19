import java.util.Scanner;
public class number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter your username");
        String u = sc.nextLine();
        System.out.println("enter the password");
        String p = sc.nextLine();
        if (u.equals("hansika")){
            if (p.equals("helloworld")){
                System.out.println("access granted");
            }
            else{
                System.out.println("incorrect password");
            }
        }
        else{
            System.out.println("invalid username");
        }
    }
}
