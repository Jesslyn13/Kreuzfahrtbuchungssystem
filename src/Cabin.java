import java.util.Map;

public class Cabin {

    //President suite is assigned a "size" so it can simply be a part of the price map

    static final int PRESIDENT_SUITE_KEY = 5;
    static final double OUTSIDE_CABIN_COST_MULTIPLIER = 1.4;

    // This map sets up the size of cabins to correspond to a specific price
    // President Suite can not be easily described like this, so it is set as a constant

    static final Map<Integer,Integer> PRICE_PER_DAY = Map.of(
            1,250,
            2,200,
            3,175,
            4,150,
            PRESIDENT_SUITE_KEY,15000);

    boolean booked;
    boolean hasWindow;
    int    size;
    int costPerDay;

    public Cabin(boolean hasWindow, int size) {
        this.hasWindow=hasWindow;
        this.size=size;
        calculateCost();
    }

    public void setBookedStatus(boolean isBooked) {
        booked=isBooked;
    }

    public void calculateCost() {
        costPerDay = PRICE_PER_DAY.get(size); // default cost for a cabin simply depend on its size

        if(hasWindow) {
            costPerDay *= OUTSIDE_CABIN_COST_MULTIPLIER;   // cabins with a window are more expensive by a fixed multiplier
        }

    }

}
