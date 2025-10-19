import java.util.Scanner;
public class Number11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter a number (1-7) for a day in week");
        int day = sc.nextInt();
        switch(day){
            case 1:
            System.out.println("Sunday: its a holiday");
            break;
            case 2:
            System.err.println("Monday: you have a DBMS lab");
            break;
            case 3:
            System.out.println("Tuesday: you have to submit assignment");
            break;
            case 4:
            System.out.println("wednesday: you have physics viva");
            break;
            case 5:
            System.out.println("thrusday: you have placement training");
            break;
            case 6:
            System.out.println("friday: you have a viva of chemistry");
            break;
            case 7:
            System.out.println("nothing work is left");
            break;
            default:
            System.out.println("invalid day");
        }
    }
}

