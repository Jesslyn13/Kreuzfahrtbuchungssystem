package logic;

import java.util.Arrays;

public class Cabin {

    TimeSpan[] bookedTimes = new TimeSpan[1000];
    int bookingEntryCount = 0;
    private final boolean hasWindow;
    private int guestsBooked;
    private final int guestCapacity;

    public Cabin(boolean hasWindow, int guestCapacity) {
        this.hasWindow = hasWindow;
        this.guestCapacity = guestCapacity;
    }

    @Override
    public String toString() {
        return "Cabin{" +
                "bookedTimes=" + Arrays.toString(bookedTimes) +
                ", bookingEntryCount=" + bookingEntryCount +
                ", hasWindow=" + hasWindow +
                ", guestCapacity=" + guestCapacity +
                '}';
    }

    public void setBookedGuests(int guestsBooked) {
        this.guestsBooked = guestsBooked;
    }

    public int calculateTotalCost(TimeSpan t) {
        return calculateCostPerDay() * (int) t.getDuration();
    }

    public int calculateCostPerDay() {
        int costPerDay = Constants.PRICE_PER_DAY_PER_GUEST.get(guestCapacity); // Default cost for a cabin simply depend on its size
        costPerDay *= guestsBooked;

        if (hasWindow && guestCapacity!=Constants.PRESIDENT_SUITE_KEY) {
            costPerDay *= Constants.OUTSIDE_CABIN_COST_MULTIPLIER;   // Cabins with a window are more expensive by a fixed multiplier
        }
        return costPerDay;
    }

    public void addBookingEntry(TimeSpan t) {
        bookedTimes[bookingEntryCount] = t;
        bookingEntryCount++;
    }

    public int getCapacity() {
        return guestCapacity;
    }

    public boolean hasWindow() {
        return hasWindow;
    }

    public boolean isAvailable(TimeSpan timespan) {
        for(int i = 0; i<bookingEntryCount;i++) {
            if(bookedTimes[i]!=null) {
                if (bookedTimes[i].isOverlapping(timespan)) {
                    return false;
                }
            }
        }
        return true;
    }

}
