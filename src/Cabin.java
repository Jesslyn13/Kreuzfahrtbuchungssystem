public class Cabin {

    static final int PRESIDENT_SUITE = 5;

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

    // Cabin costs
    public void calculateCost() {
        switch (size) {
            case 1 ->               costPerDay = 250;
            case 2 ->               costPerDay = 200;
            case 3 ->               costPerDay = 175;
            case 4 ->               costPerDay = 150;
            case PRESIDENT_SUITE -> costPerDay = 15000;
        }
        if(hasWindow) costPerDay*=1.4;
    }

}
