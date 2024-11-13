
import java.util.Scanner;

// Splits a restaurant bill evenly among three diners.
public class Bill3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(("enter 3 names"));

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();

        System.out.print(("enter total amount"));
        double billAmount = scanner.nextDouble();

        double amountPerPerson = Math.ceil(billAmount / 3.0);

        System.out.printf("Dear" + name1 + ", " + name2 + " and " + name3
                + " : pay " + amountPerPerson + " each.");
    }
}
