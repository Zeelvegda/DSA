import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the num of seconds");
        int totalseconds = scanner.nextInt();
        int hours=totalseconds/3600;
        int minutes=(totalseconds %3600)/60;
        int seconds=(totalseconds %3600)/60;
        System.out.println(hours +":" +minutes +":" +seconds);
    }
}
