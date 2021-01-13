public class ShipLogic implements Constants{
    static Cabin[] ship = new Cabin[402];

    public static void generateShip() {

        int index=0;

        for(int i = index; i<OUTER_ONE_PERSON_CABIN_COUNT ; i++) {
        ship[i] = new Cabin(true, 1);
        }
        index+=OUTER_ONE_PERSON_CABIN_COUNT;

        for(int i = index; i<index+INNER_ONE_PERSON_CABIN_COUNT ; i++) {
            ship[i] = new Cabin(false, 1);
        }
        index+=INNER_ONE_PERSON_CABIN_COUNT;

        for(int i = index; i<index+OUTER_TWO_PERSON_CABIN_COUNT ; i++) {
            ship[i] = new Cabin(true, 2);
        }
        index+=OUTER_TWO_PERSON_CABIN_COUNT;

        for(int i = index; i<index+INNER_TWO_PERSON_CABIN_COUNT ; i++) {
            ship[i] = new Cabin(false, 2);
        }
        index+=INNER_TWO_PERSON_CABIN_COUNT;

        for(int i = index; i<index+OUTER_THREE_PERSON_CABIN_COUNT ; i++) {
            ship[i] = new Cabin(true, 3);
        }
        index+=OUTER_THREE_PERSON_CABIN_COUNT;

        for(int i = index; i<index+INNER_THREE_PERSON_CABIN_COUNT ; i++) {
            ship[i] = new Cabin(false, 3);
        }
        index+=INNER_THREE_PERSON_CABIN_COUNT;

        for(int i = index; i<index+OUTER_FOUR_PERSON_CABIN_COUNT ; i++) {
            ship[i] = new Cabin(true, 4);
        }
        index+=OUTER_FOUR_PERSON_CABIN_COUNT;

        for(int i = index; i<index+INNER_FOUR_PERSON_CABIN_COUNT ; i++) {
            ship[i] = new Cabin(false, 4);
        }
        index+=INNER_FOUR_PERSON_CABIN_COUNT;

        for(int i = index; i<index+PRESIDENT_SUITE_COUNT ; i++) {
            ship[i] = new Cabin(true, PRESIDENT_SUITE_KEY);
        }
    }


}
