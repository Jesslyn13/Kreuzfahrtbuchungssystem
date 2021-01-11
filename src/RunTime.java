import java.util.Scanner;

public class RunTime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hallo Herzlich Willkommen auf der Titanic 2");

        // number of people
        System.out.println("Mit wie vielen Personen möchten Sie an Bord gehen?");
        int people = scanner.nextInt();


        // duration of the journey
        System.out.println("Für wie viele Tage dürfen wir sie begrüßen?");
        int stay = scanner.nextInt();


        // type of cabin (in/outside)
        System.out.println("Möchten sie eine Außenkabine?");
        String typeOfCabin = scanner.nextLine();


        // calculation of the total cost
        System.out.println("Ihr " + stay + " tägier Aufenthalt bei uns kostet insgesammt " + TotalCost + " €.");
        System.out.println("Sie haben Zimmernummer: " + RomeNumber);

        System.out.println("Die Titanic 2 wünscht eine sichchere Reise - Gemeinsam gehen wir nicht wieder unter :)");

        scanner.close();
    }
}