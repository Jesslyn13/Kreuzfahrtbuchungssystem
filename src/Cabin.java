public class Cabin {

    TimeSpan[] bookedTimes = new TimeSpan[1000];
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
        costPerDay = Constants.PRICE_PER_DAY_PER_GUEST.get(guestCapacity); // Default cost for a cabin simply depend on its size
        costPerDay *= guestsBooked;

        if (hasWindow) {
            costPerDay *= Constants.OUTSIDE_CABIN_COST_MULTIPLIER;   // Cabins with a window are more expensive by a fixed multiplier
        }
    }

    public boolean isAvailable(TimeSpan timespan) {
        for(TimeSpan t : bookedTimes) {
            if(t.isOverlapping(timespan)) {
                return false;
            }
        }
        return true;
    }

}
