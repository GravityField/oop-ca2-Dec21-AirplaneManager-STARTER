package dkit.oop;

import java.util.ArrayList;

public class CargoAirplane extends Airplane{

    // fields (ref. Q1)
private final int MAX_LOAD_KILOS;
private final int currentLoad;
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
                '}' + super.toString();
    }
} // END of CargoAirplane class.

