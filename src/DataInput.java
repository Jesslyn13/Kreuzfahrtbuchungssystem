import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class DataInput {

    private Scanner scanner = new Scanner(System.in);

    boolean wantWindow;

    public void CheckIn(ShipLogic myLogic) throws ParseException {

        //TODO: Struktur überarbeiten um Filteroptionen zuzulassen
        System.out.println("Herzlich Willkommen auf der Titanic 2");

        System.out.println("Wann beginnen sie ihre Reise? dd.mm.yyyy");
        Date dateOfArrival = Constants.DATE_FORMAT.parse(scanner.nextLine());

        System.out.println("Wann hört ihre Reise auf? dd.mm.yyyy");
        Date dateOfDeparture = Constants.DATE_FORMAT.parse(scanner.nextLine());


        System.out.println("Was für ein Zimmer wollen sie haben?");
        System.out.println("1 - Einzelzimmer");
        System.out.println("2 - Doppelzimmer");
        System.out.println("3 - Dreierzimmer");
        System.out.println("4 - Viererzimmer");
        System.out.println("5 - Präsidentensuit");

        int room = scanner.nextInt();
        if (room == 1 || room == 2 || room == 3 || room == 4) {
            System.out.println("Möchten sie eine Außenkabine?");
            String typeOfCabin = scanner.next();
            wantWindow = typeOfCabin.equalsIgnoreCase("Ja");

        } else if (room == 5) {
            wantWindow = true;
        } else {
            System.out.println("Zimmercode ist ungültig");
        }

        System.out.println("Mit wie vielen Personen kommen sie an Bord?");
        int people = scanner.nextInt();
        if (!(people >= 1 && people <= room)) {
            System.out.println("Es können nur min. 1/max. 4 Personen in ein Zimmer. Ihr Zimmer muss auch großgenug sein!");
            return;
        }



        //TODO: Werte richtig einspeichern
        new Cabin(wantWindow, people);


        System.out.println("Ihr Aufenthalt bei uns kostet insgesamt €.");
        System.out.println("Die Titanic 2 wünscht eine sichere Reise - Gemeinsam gehen wir nicht wieder unter:)");

        scanner.close();
    }
}
