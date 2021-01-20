import java.sql.Time;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class RunTime {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
      ShipLogic SL = new ShipLogic();
      new DataInput().ConsoleCheckIn(SL);
    }
}