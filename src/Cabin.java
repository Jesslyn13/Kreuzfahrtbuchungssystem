import java.util.Map;

public class Cabin {

    static final int PRESIDENT_SUITE = 5;
    static final Map<Integer,Integer> PRICE_PER_DAY = Map.of(
            1,250,
            2,200,
            3,175,
            4,150,
            PRESIDENT_SUITE,15000);

    // variables
    boolean booked;
    boolean hasWindow;
    int    size;
    int costPerDay;

    // cabin configuration
    public Cabin(boolean hasWindow, int size) {
        this.hasWindow=hasWindow;
        this.size=size;
        calculateCost();
    }

    // booked status
    public void setBookedStatus(boolean isBooked) {
        booked=isBooked;
    }

    // Cabin costs
    public void calculateCost() {
        costPerDay=PRICE_PER_DAY.get(size);
        if(hasWindow) costPerDay*=1.4;


    }

}
