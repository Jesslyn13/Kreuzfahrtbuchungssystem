package logic;

import guiFenstern.GUI;

import java.text.ParseException;

public class RunTime {

    public static void main(String[] args) throws ParseException {
        ShipLogic SL = new ShipLogic();
        DataInput inputManager = new DataInput(SL);
        GUI firstPage = new GUI();
    }
}