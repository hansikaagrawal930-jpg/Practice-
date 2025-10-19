import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your favorite color: ");
        String color = sc.nextLine();

        if (color.equalsIgnoreCase("blue")) {
            System.out.println("Cool choice! Blue is calming.");
        } else if (color.equalsIgnoreCase("red")) {
            System.out.println("Red — full of energy!");
        } else {
            System.out.println("Nice color! Everyone has unique taste.");
        }
    }
}

