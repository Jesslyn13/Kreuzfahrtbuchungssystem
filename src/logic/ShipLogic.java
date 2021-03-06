package logic;

public class ShipLogic{
    static Cabin[] myShip = new Cabin[Constants.TOTAL_CABIN_COUNT];

    public ShipLogic() {

        int index = 0;
        for (CabinType ct : Constants.CABIN_TYPES) {
            for (int i = index; i < index + ct.getCount(); i++) {
                myShip[i] = new Cabin(ct.hasWindow(), ct.getCapacity());
            }
            index += ct.getCount();
        }
    }

    public boolean containsCabinType(CabinType ct) {
        for(Cabin c :  myShip) {
            if(ct.getCapacity()==c.getCapacity() && ct.hasWindow()==c.hasWindow()) {
                return true;
            }
        }
        return false;
    }

    public Cabin[] filterByTimeSpan(Cabin[] cabins, TimeSpan t) {
        Cabin[] matchingCabins = new Cabin[Constants.TOTAL_CABIN_COUNT];
        int index = 0;
        for(Cabin c : cabins) {
            if(c!=null) {
                if (c.isAvailable(t)) {
                    matchingCabins[index] = c;
                    index++;
                }
            }
        }
        return matchingCabins;
    }

    public Cabin[] filterBySize(Cabin[] cabins, int size) {
        Cabin[] matchingCabins = new Cabin[Constants.TOTAL_CABIN_COUNT];
        int index = 0;
        for(Cabin c : cabins) {
            if(c!=null) {
                if (c.getCapacity() == size) {
                    matchingCabins[index] = c;
                    index++;
                }
            }
        }
        return matchingCabins;
    }

    public Cabin[] filterByWindow(Cabin[] cabins, boolean hasWindow) {
        Cabin[] matchingCabins = new Cabin[Constants.TOTAL_CABIN_COUNT];
        int index = 0;
        for(Cabin c : cabins) {
            if(c!=null) {
                if (c.hasWindow() == hasWindow) {
                    matchingCabins[index] = c;
                    index++;
                }
            }
        }
        return matchingCabins;
    }

    public Cabin[] getCabins() {
        return myShip;
    }






}
