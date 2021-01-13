import java.util.Map;

public class Cabin implements Constants {

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
