import java.text.ParseException;
import java.util.Scanner;

public class DataInput {

    // DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    // Date date = dateFormat.parse("10-01-2021");

    Scanner scanner = new Scanner(System.in);

    Boolean wantWindow;

    // Entering the guest data
    public void CheckIn() throws ParseException {

        System.out.println("Hallo Herzlich Willkommen auf der Titanic 2");

        // number of people
        System.out.println("Mit wie vielen Persoen kommen sie an Bord?");
        int people = scanner.nextInt();


        // duration of the journey
        System.out.println("Wie viele Tage soll ihre Reise dauern?");
        int duritationOfStay = scanner.nextInt();

        // type of cabin (in/outside)
        System.out.println("Möchten sie eine Außenkabine? ");
        String typeOfCabin = scanner.next();
        if (typeOfCabin.equalsIgnoreCase("Ja")) {
            wantWindow = true;
        } else {
            wantWindow = false;
        }


        // calculation of the total cost
        System.out.println("Ihr Aufenthalt bei uns kostet insgesammt €.");

        System.out.println("Die Titanic 2 wünscht eine sichchere Reise - Gemeinsam gehen wir nicht wieder unter :)");

        scanner.close();
    }
}
