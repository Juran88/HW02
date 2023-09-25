import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter height: ");
        double heigh = Double.parseDouble(scanner.nextLine());
        System.out.println("Pleas enter weight: ");
        double weight = scanner.nextDouble();

        double area = heigh * heigh;
        System.out.println("Heigh is");

        double weigh = weight / (heigh * heigh);
        System.out.println("Body mass index" + " " + area);
    }
}
