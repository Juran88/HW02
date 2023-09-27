import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter height in meters: ");
        double heigh = Double.parseDouble(scanner.nextLine());
        System.out.println("Pleas enter weight in kilograms: ");
        double weight = scanner.nextDouble();


        double bmi = weight / (heigh * heigh);
        System.out.println("Body mass index" + " " + bmi);
    }
}
