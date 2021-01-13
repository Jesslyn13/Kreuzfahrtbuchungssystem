import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class DataInput{

    Scanner scanner = new Scanner(System.in);

    public void CheckIn(ShipLogic myLogic) throws ParseException {

        System.out.println("Herzlich Willkommen auf der Titanic 2");
        System.out.println("Wann beginnen sie ihre Reise? dd.mm.yyyy");
        Date dateOfArrival = Constants.DATE_FORMAT.parse(scanner.nextLine());

        System.out.println("Wann hört ihre Reise auf? dd.mm.yyyy");
        Date dateOfDeparture = Constants.DATE_FORMAT.parse(scanner.nextLine());

        System.out.println("Möchten sie eine Außenkabine?");
        String typeOfCabin = scanner.next();
        boolean wantWindow = typeOfCabin.equalsIgnoreCase("Ja");

        System.out.println("Mit wie vielen Personen kommen sie an Bord?");
        int people = scanner.nextInt();
        if (!(people >= 1 && people <= 4))
            System.out.println("Es können nur min. 1/max. 4 Personen in ein Zimmer. Wenn sie mehr Zimmer benötigen, buchen sie diese bitte einzelen!");

        new Cabin(wantWindow, people);

        System.out.println("Ihr Aufenthalt bei uns kostet insgesamt €.");
        System.out.println("Die Titanic 2 wünscht eine sichere Reise - Gemeinsam gehen wir nicht wieder unter:)");

        scanner.close();
    }
}
