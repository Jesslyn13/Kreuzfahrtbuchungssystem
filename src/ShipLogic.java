public class ShipLogic implements Constants {
    static Cabin[] myShip = new Cabin[TOTAL_CABIN_COUNT];

    public ShipLogic() {

        int index = 0;
        for (CabinType ct : CABIN_TYPES) {
            for (int i = index; i < index + ct.getCount(); i++) {
                myShip[i] = new Cabin(ct.hasWindow(), ct.getCapacity());
            }
            index += ct.getCount();
        }

    }

    public Cabin[] getFreeCabins(TimeSpan t) {
        Cabin[] freeCabins = new Cabin[TOTAL_CABIN_COUNT];
        int index = 0;
        for(Cabin c : myShip) {
            if(c.isAvailable(t)) {
                freeCabins[index] = c;
                index++;
            }
        }
        return freeCabins;
    }


}
