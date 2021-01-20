import java.text.ParseException;
import java.util.Scanner;

public class RunTime {

    //Moin
    public static void main(String[] args) throws ParseException {
      ShipLogic SL = new ShipLogic();
      new DataInput().ConsoleCheckIn(SL);
    }
}