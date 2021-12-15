package dkit.oop;

import java.util.ArrayList;

public class CargoAirplane extends Airplane{

    // fields (ref. Q1)
private final int MAX_LOAD_KILOS;
private int currentLoad;
ArrayList<String> passengerList;
    // constructor

    public CargoAirplane(String type, int maxLoad) {
        super(type);
        this.MAX_LOAD_KILOS = maxLoad;
        this.currentLoad = 0;
    }


    // toString()


    @Override
    public String toString() {
        return "CargoAirplane{" +
                "MAX_LOAD_KILOS=" + MAX_LOAD_KILOS +
                ", currentLoad=" + currentLoad +
                ", passengerList=" + passengerList +
                '}';
    }
} // END of CargoAirplane class.

