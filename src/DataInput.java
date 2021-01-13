import java.util.Scanner;

public class DataInput {

    // DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    // Date date = dateFormat.parse("10-01-2021");

    Scanner scanner = new Scanner(System.in);

    Boolean wantWindow;

    public void CheckIn(ShipLogic myLogic) {

        System.out.println("Herzlich Willkommen auf der Titanic 2");
        System.out.println("Mit wie vielen Personen kommen sie an Bord?");
        int people = scanner.nextInt();

        System.out.println("Wie viele Tage soll ihre Reise dauern?");
        int duritationOfStay = scanner.nextInt();

        System.out.println("Möchten sie eine Außenkabine?");
        String typeOfCabin = scanner.next();
        if (typeOfCabin.equalsIgnoreCase("Ja")) {
            wantWindow = true;
        } else {
            wantWindow = false;
        }

        System.out.println("Ihr Aufenthalt bei uns kostet insgesamt €.");
        System.out.println("Die Titanic 2 wünscht eine sichere Reise - Gemeinsam gehen wir nicht wieder unter:)");

        scanner.close();
    }
}
