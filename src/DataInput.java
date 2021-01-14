import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class DataInput {

    private final Scanner scanner = new Scanner(System.in);

    boolean wantWindow;

    public void CheckIn(ShipLogic myLogic) throws ParseException {

        //TODO: Struktur überarbeiten um Filteroptionen zuzulassen
        System.out.println("Herzlich Willkommen auf der Titanic 2");

        System.out.println("Wann beginnen sie ihre Reise? dd.mm.yyyy");
        Date dateOfArrival = Constants.DATE_FORMAT.parse(scanner.nextLine());

        System.out.println("Wann hört ihre Reise auf? dd.mm.yyyy");
        Date dateOfDeparture = Constants.DATE_FORMAT.parse(scanner.nextLine());


        System.out.println("Was für ein Zimmer wollen sie haben?");

        System.out.print("1 - Einzelzimmer");
        if(myLogic.filterBySize(myLogic.getCabins(), 1)[0]==null) System.out.print(" -- Ausgebucht");
        System.out.println("");

        System.out.print("2 - Doppelzimmer");
        if(myLogic.filterBySize(myLogic.getCabins(), 2)[0]==null) System.out.print(" -- Ausgebucht");
        System.out.println("");

        System.out.print("3 - Dreierzimmer");
        if(myLogic.filterBySize(myLogic.getCabins(), 3)[0]==null) System.out.print(" -- Ausgebucht");
        System.out.println("");

        System.out.print("4 - Viererzimmer");
        if(myLogic.filterBySize(myLogic.getCabins(), 4)[0]==null) System.out.print(" -- Ausgebucht");
        System.out.println("");

        System.out.print("5 - Präsidentensuite");
        if(myLogic.filterBySize(myLogic.getCabins(), Constants.PRESIDENT_SUITE_KEY)[0]==null) System.out.print(" -- Ausgebucht");
        System.out.println("");

        int roomType = scanner.nextInt();
        if (roomType == 1 || roomType == 2 || roomType == 3 || roomType == 4) {
            System.out.println("Möchten sie eine Außenkabine?");
            String typeOfCabin = scanner.next();
            wantWindow = typeOfCabin.equalsIgnoreCase("Ja");

        } else if (roomType == 5) {
            wantWindow = true;
            System.out.println("In die Präsidentensuit können maximal 10 Personen!");
            roomType = 10; // President Suit has a capacity of 10 people

        } else {
            System.out.println("Zimmercode ist ungültig");
        }

        System.out.println("Mit wie vielen Personen kommen sie an Bord?");
        int people = scanner.nextInt();
        if (!(people >= 1 && people <= roomType)) {
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
