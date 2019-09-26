import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TaxiService taxiService = new TaxiService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance in kilometers");
        int tripAmount = taxiService.count(scanner.nextInt());
        System.out.println("The cost of your trip will be " + tripAmount + " rubles");
        scanner.close();
    }
}
