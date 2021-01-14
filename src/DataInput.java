import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class DataInput {

    private final Scanner scanner = new Scanner(System.in);

    private boolean wantWindow;

    public void CheckIn(ShipLogic myLogic) throws ParseException {
        boolean booking = true;
        while(booking) {
            Cabin[] filteredList;

            System.out.println("Herzlich Willkommen auf der Titanic 2");

            System.out.println("Wann beginnen sie ihre Reise? dd.mm.yyyy");
            Date dateOfArrival = Constants.DATE_FORMAT.parse(scanner.nextLine());

            System.out.println("Wann hört ihre Reise auf? dd.mm.yyyy");
            Date dateOfDeparture = Constants.DATE_FORMAT.parse(scanner.nextLine());

            TimeSpan plannedTimeSpan = new TimeSpan(dateOfArrival,dateOfDeparture);
            filteredList = myLogic.filterByTimeSpan(myLogic.getCabins(),plannedTimeSpan);

            //TODO: Dialog falls keine Kabine zum Datum
            if(filteredList[0] == null) {
                System.out.println("Leider sind alle Kabinen in dem angegebenen Zeitraum ausgebucht!");
                booking = false;
            }

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
            if (myLogic.filterBySize(filteredList, Constants.PRESIDENT_SUITE_KEY)[0] == null) System.out.print(" -- Ausgebucht");
            System.out.println();

            int roomType = scanner.nextInt();

            filteredList = myLogic.filterBySize(filteredList, roomType);
            if(filteredList[0]==null) {
                System.out.println("No cabins with selected properties remaining.");
                return;
            }


            if (roomType == 1 || roomType == 2 || roomType == 3 || roomType == 4) {
                System.out.println("Möchten sie eine Außenkabine?");
                //TODO: Dialog falls keine Außen/Innenkabinen
                String typeOfCabin = scanner.next();
                wantWindow = typeOfCabin.equalsIgnoreCase("Ja");

            } else if (roomType == Constants.PRESIDENT_SUITE_KEY) {
                wantWindow = true;
                //TODO: Dialog falls keinePräsidentensuite
                System.out.println("In die Präsidentensuit können maximal 10 Personen!");

            } else {
                System.out.println("Zimmercode ist ungültig");
            }

            if(filteredList[0]==null) {
                System.out.println("No cabins with selected properties remaining.");
                return;
            }

            if(filteredList[0]==null) {
                System.out.println("list null");
            }
            System.out.println(Arrays.asList(filteredList).contains(null));

            filteredList = myLogic.filterByWindow(filteredList, wantWindow);
            if(filteredList[0]==null) {
                System.out.println("No cabins with selected properties remaining.");
                return;
            }


            //TODO: Loop until correct input
            System.out.println("Mit wie vielen Personen kommen sie an Bord?");
            int people = scanner.nextInt();
            scanner.nextLine();
            if (!(people >= 1 && people <= roomType)) {
                //TODO: Individueller Dialog pro Kabinengröße
                System.out.println("Die Kabinengröße ist leider zu klein für die angegebene Personenanzahl");
                booking = false;
            }


            Cabin chosenCabin = filteredList[0];
            chosenCabin.setBookedGuests(people);
            chosenCabin.addBookingEntry(new TimeSpan(dateOfArrival,dateOfDeparture));
            int cost = chosenCabin.calculateTotalCost(plannedTimeSpan);

            System.out.println("Sie haben eine Zimmergröße von " + roomType + " für " + people + " Personen ausgewählt. \n" +
                    "Die Kabine ist vom " + dateOfArrival + " bis " + dateOfDeparture + " gebucht. \n" +
                    "Die kosten belauen sich auf: " + cost);

            System.out.println("Die Titanic 2 wünscht eine sichere Reise - Gemeinsam gehen wir nicht wieder unter:)");


            //TODO: Abbruchbedingung
        }
        scanner.close();
    }
}
