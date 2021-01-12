import java.util.Map;

public class Cabin {


    static final double OUTSIDE_CABIN_COST_MULTIPLIER = 1.4;

    // President suite is assigned a "size" so it can simply be a part of the price map
    static final int PRESIDENT_SUITE_KEY = 5;

    // Setting up a map so the size of cabins correspond to a specific price
    static final Map<Integer, Integer> PRICE_PER_DAY_PER_GUEST = Map.of(
            1, 250,
            2, 200,
            3, 175,
            4, 150,
            PRESIDENT_SUITE_KEY, 15000);


    TimeSpan[] bookedTimes;
    boolean hasWindow;
    int guestsBooked;
    int guestCapacity;
    int costPerDay;

    public Cabin(boolean hasWindow, int guestCapacity) {
        this.hasWindow = hasWindow;
        this.guestCapacity = guestCapacity;
    }


    public void setBookedStatus(int guestsBooked) {
        this.guestsBooked = guestsBooked;
    }

    public TimeSpan[] getBookedTimes() {
        return bookedTimes;
    }

    public void calculateCost() {
        costPerDay = PRICE_PER_DAY_PER_GUEST.get(guestCapacity); // default cost for a cabin simply depend on its size
        costPerDay *= guestsBooked;

        if (hasWindow) {
            costPerDay *= OUTSIDE_CABIN_COST_MULTIPLIER;   // cabins with a window are more expensive by a fixed multiplier
        }

    }

}
