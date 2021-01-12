import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RunTime {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = dateFormat.parse("10.01.2021");


        System.out.println("Hallo Herzlich Willkommen auf der Titanic 2");

        // number of people
      //  System.out.println("Wie viele Personen sind?");
       // int people = scanner.nextInt();


        // duration of the journey
       // System.out.println("An welchem Datum möchten sie an Bord kommen?");
       // int startDateOfStay = scanner.nextInt();

       // System.out.println("An welchem Datum gehen sie von Bord?");
       // int endDateOfStay = scanner.nextInt();


        // type of cabin (in/outside)
     //   System.out.println("Möchten sie eine Außenkabine?");
      //  String typeOfCabin = scanner.nextLine();


        // calculation of the total cost
       // System.out.println("Ihr Aufenthalt vom " + startDateOfStay + " bis zum " + endDateOfStay + "  bei uns kostet insgesammt €.");

        System.out.println("Die Titanic 2 wünscht eine sichchere Reise - Gemeinsam gehen wir nicht wieder unter :)");

        scanner.close();
    }
}