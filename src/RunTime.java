import java.text.ParseException;

public class RunTime {

    public static void main(String[] args) throws ParseException {
        ShipLogic SL = new ShipLogic();
        new DataInput().ConsoleCheckIn(SL);
    }
}