public class Cabin {

    static final int PRESIDENT_SUITE = 5;

    boolean booked;
    boolean hasWindow;
    int size;
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
            case 1: costPerDay=250; break;
            case 2: costPerDay=200; break;
            case 3: costPerDay=175; break;
            case 4: costPerDay=150; break;
            case PRESIDENT_SUITE: costPerDay=15000; break;
        }
        if(hasWindow) costPerDay*=1.4;
    }

}
