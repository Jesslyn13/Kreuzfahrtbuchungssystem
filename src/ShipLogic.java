public class ShipLogic implements Constants {
    static Cabin[] myShip = new Cabin[TOTAL_CABIN_COUNT];

    public ShipLogic() {
        /*
        for(int i = index; i<OUTER_ONE_PERSON_CABIN_COUNT ; i++) {
            myShip[i] = new Cabin(true, 1);
        }
        index+=OUTER_ONE_PERSON_CABIN_COUNT;

        for(int i = index; i<index+INNER_ONE_PERSON_CABIN_COUNT ; i++) {
            myShip[i] = new Cabin(false, 1);
        }
        index+=INNER_ONE_PERSON_CABIN_COUNT;

        for(int i = index; i<index+OUTER_TWO_PERSON_CABIN_COUNT ; i++) {
            myShip[i] = new Cabin(true, 2);
        }
        index+=OUTER_TWO_PERSON_CABIN_COUNT;

        for(int i = index; i<index+INNER_TWO_PERSON_CABIN_COUNT ; i++) {
            myShip[i] = new Cabin(false, 2);
        }
        index+=INNER_TWO_PERSON_CABIN_COUNT;

        for(int i = index; i<index+OUTER_THREE_PERSON_CABIN_COUNT ; i++) {
            myShip[i] = new Cabin(true, 3);
        }
        index+=OUTER_THREE_PERSON_CABIN_COUNT;

        for(int i = index; i<index+INNER_THREE_PERSON_CABIN_COUNT ; i++) {
            myShip[i] = new Cabin(false, 3);
        }
        index+=INNER_THREE_PERSON_CABIN_COUNT;

        for(int i = index; i<index+OUTER_FOUR_PERSON_CABIN_COUNT ; i++) {
            myShip[i] = new Cabin(true, 4);
        }
        index+=OUTER_FOUR_PERSON_CABIN_COUNT;

        for(int i = index; i<index+INNER_FOUR_PERSON_CABIN_COUNT ; i++) {
            myShip[i] = new Cabin(false, 4);
        }
        index+=INNER_FOUR_PERSON_CABIN_COUNT;

        for(int i = index; i<index+PRESIDENT_SUITE_COUNT ; i++) {
            myShip[i] = new Cabin(true, PRESIDENT_SUITE_KEY);
        }

         */

        int index = 0;

        for (CabinType ct : CABIN_TYPES) {
            for (int i = index; i < index + ct.getCount(); i++) {
                myShip[i] = new Cabin(ct.hasWindow(), ct.getCapacity());
            }
            index += ct.getCount();
        }


    }


}
