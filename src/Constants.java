import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;

public interface Constants {

    // cabins with a window are more expensive by this multiplier
    double OUTSIDE_CABIN_COST_MULTIPLIER = 1.4;

    // President suite is assigned a "size" so it can simply be a part of the price map
    int PRESIDENT_SUITE_KEY = 5;

    DateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    // Setting up a map so the size of cabins correspond to a specific price
    Map<Integer, Integer> PRICE_PER_DAY_PER_GUEST = Map.of(
            1, 250,
            2, 200,
            3, 175,
            4, 150,
            PRESIDENT_SUITE_KEY, 15000);

    int INNER_FOUR_PERSON_CABIN_COUNT = 40;
    int OUTER_FOUR_PERSON_CABIN_COUNT = 60;
    int INNER_THREE_PERSON_CABIN_COUNT = 40;
    int OUTER_THREE_PERSON_CABIN_COUNT = 60;
    int INNER_TWO_PERSON_CABIN_COUNT = 40;
    int OUTER_TWO_PERSON_CABIN_COUNT = 60;
    int INNER_ONE_PERSON_CABIN_COUNT = 40;
    int OUTER_ONE_PERSON_CABIN_COUNT = 60;
    int PRESIDENT_SUITE_COUNT = 2;

}


