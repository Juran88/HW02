import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter  number of seconds");
        int Seconds = scanner.nextInt();

        int seconds = 3661;
        int hour = 3661 / (60 * 60);
        seconds = 3661 % (60 * 60);
        int minute = seconds / 60;
        seconds = seconds % 60;

        System.out.println(hour + ":" + minute + ":" + seconds);




    }
}
