import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class DataInput {

    private final Scanner scanner = new Scanner(System.in);

    private boolean wantWindow;

    public void CheckIn(ShipLogic myLogic) throws ParseException {
        boolean booking = true;
        while (booking) {
            Cabin[] filteredList;

            System.out.println("Herzlich Willkommen auf der Titanic 2");

            System.out.println("Wann beginnen sie ihre Reise? dd.mm.yyyy");
            Date dateOfArrival = Constants.DATE_FORMAT.parse(scanner.nextLine());

            System.out.println("Wann hört ihre Reise auf? dd.mm.yyyy");
            Date dateOfDeparture = Constants.DATE_FORMAT.parse(scanner.nextLine());

            TimeSpan plannedTimeSpan = new TimeSpan(dateOfArrival, dateOfDeparture);
            filteredList = myLogic.filterByTimeSpan(myLogic.getCabins(), plannedTimeSpan);

            System.out.println("Was für ein Zimmer wollen sie haben?");

            System.out.print("1 - Einzelzimmer");
            if (myLogic.filterBySize(filteredList, 1)[0] == null) System.out.print(" -- Ausgebucht");
            System.out.println();

            System.out.print("2 - Doppelzimmer");
            if (myLogic.filterBySize(filteredList, 2)[0] == null) System.out.print(" -- Ausgebucht");
            System.out.println();

            System.out.print("3 - Dreierzimmer");
            if (myLogic.filterBySize(filteredList, 3)[0] == null) System.out.print(" -- Ausgebucht");
            System.out.println();

            System.out.print("4 - Viererzimmer");
            if (myLogic.filterBySize(filteredList, 4)[0] == null) System.out.print(" -- Ausgebucht");
            System.out.println();

            System.out.print("5 - Präsidentensuite");
            if (myLogic.filterBySize(filteredList, Constants.PRESIDENT_SUITE_KEY)[0] == null)
                System.out.print(" -- Ausgebucht");
            System.out.println();

            int roomType = scanner.nextInt();

            if (roomType != 5) {
                filteredList = myLogic.filterBySize(filteredList, roomType);
            } else {
                filteredList = myLogic.filterBySize(filteredList, Constants.PRESIDENT_SUITE_KEY);
            }


            if (roomType == 1 || roomType == 2 || roomType == 3 || roomType == 4) {
                System.out.println("Möchten sie eine Außenkabine? [Ja/Nein]");
                String typeOfCabin = scanner.next();
                wantWindow = typeOfCabin.equalsIgnoreCase("Ja");

            } else if (roomType == 5) {
                wantWindow = true;
                roomType = 10; // set the cabin limit for the presidential suite
                System.out.println("In die Präsidentensuite können maximal 10 Personen!");

            } else {
                System.out.println("Zimmercode ist ungültig");
            }

            if (filteredList[0] == null) {
                System.out.println("Leider ist das ausgewählte Zimmer nicht mehr verfügbar.");
                return;
            }

            filteredList = myLogic.filterByWindow(filteredList, wantWindow);


            boolean correctPersonCount = true;

            int people = 0;
            while (correctPersonCount) {
                System.out.println("Mit wie vielen Personen kommen sie an Bord?");
                people = scanner.nextInt();
                scanner.nextLine();
                if (!(people >= 1 && people <= roomType)) {
                    System.out.println(people <= 0 ? "Es muss mindestens eine Person ins Zimmer" : "Die Kabinengröße ist leider zu klein für die angegebene Personenanzahl");
                } else {
                    correctPersonCount = false;
                }
            }


            Cabin chosenCabin = filteredList[0];
            chosenCabin.setBookedGuests(people);
            chosenCabin.addBookingEntry(new TimeSpan(dateOfArrival, dateOfDeparture));
            int cost = chosenCabin.calculateTotalCost(plannedTimeSpan);

            // room type selection
            String roomTypeSelection = switch (roomType) {
                case 1 -> "Einzelzimmer";
                case 2 -> "Doppelzimmer";
                case 3 -> "Dreierzimmer";
                case 4 -> "Viererzimmer";
                default -> "Präsidentensuite";
            };

            System.out.println("\n" +
                    "=============================================================================\n");
            System.out.print(roomType == 10 ? "Sie haben ein " : "Sie haben ein ");
            System.out.println(roomTypeSelection + " für " + people + " Personen ausgewählt. \n" +
                    "Die Kabine ist vom " + dateOfArrival + " bis " + dateOfDeparture + " gebucht. \n" +
                    "Die Kosten belaufen sich auf: " + cost);

            System.out.println("Die Titanic 2 wünscht eine sichere Reise - Gemeinsam gehen wir nicht wieder unter :) \n" +
                    "=============================================================================\n\n");


            // Termination condition
            System.out.println("Wollen sie noche eine Buchung durchführen? [Ja/Nein]");
            String terminationCondition = scanner.nextLine();
            booking = terminationCondition.equalsIgnoreCase("Ja");

        }
        scanner.close();
    }
}
