public class ShipLogic implements Constants{
    static Cabin[] ship = new Cabin[402];

    public static void generateShip() {

        for(int i = 0; i<60 ; i++) {
        ship[i] = new Cabin(true, 1);
        }

        for(int i = 60; i<101 ; i++) {
            ship[i] = new Cabin(false, 1);
        }

        for(int i = 101; i<141 ; i++) {
            ship[i] = new Cabin(true, 2);
        }
        for(int i = 141; i<201 ; i++) {
            ship[i] = new Cabin(false, 2);
        }

        for(int i = 201; i<241 ; i++) {
            ship[i] = new Cabin(true, 3);
        }

        for(int i = 241; i<301 ; i++) {
            ship[i] = new Cabin(false, 3);
        }

        for(int i = 301; i<341 ; i++) {
            ship[i] = new Cabin(true, 4);
        }

        for(int i = 341; i<401 ; i++) {
            ship[i] = new Cabin(false, 4);
        }

        ship[401] = new Cabin(true, PRESIDENT_SUITE_KEY);
        ship[402] = new Cabin(true, PRESIDENT_SUITE_KEY);




    }


}
