public class Cabin {

    TimeSpan[] bookedTimes = new TimeSpan[1000];
    private final boolean hasWindow;
    private int guestsBooked;
    private final int guestCapacity;

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

    public int calculateCost() {
        int costPerDay = Constants.PRICE_PER_DAY_PER_GUEST.get(guestCapacity); // Default cost for a cabin simply depend on its size
        costPerDay *= guestsBooked;

        if (hasWindow && guestCapacity!=Constants.PRESIDENT_SUITE_KEY) {
            costPerDay *= Constants.OUTSIDE_CABIN_COST_MULTIPLIER;   // Cabins with a window are more expensive by a fixed multiplier
        }
        return costPerDay;
    }

    public int getCapacity() {
        return guestCapacity;
    }


    public boolean hasWindow() {
        return hasWindow;
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
