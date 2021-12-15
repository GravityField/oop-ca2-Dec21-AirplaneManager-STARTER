package dkit.oop;

import java.util.ArrayList;
import java.util.List;

public class PassengerAirplane extends Airplane {

    // fields(Q2)
    private final int MAX_NUM_PASSENGERS;
    ArrayList<String> passengerList;
    PassengerAirplane(String type, int maxNumPassengers) {
        // code here
        super(type);
        this.MAX_NUM_PASSENGERS = maxNumPassengers;
        this.passengerList = new ArrayList<>();
    }

    public void addPassenger(String name) {
        // code here
        if(name != null && this.passengerList.size() < this.MAX_NUM_PASSENGERS) {
            passengerList.add(name);
        }
    }

    @Override
    public String toString() {
        return "PassengerAirplane{" +
                "MAX_NUM_PASSENGERS=" + MAX_NUM_PASSENGERS +
                ", passengerList=" + passengerList +
                '}' + super.toString();
    }
} // end of PassengerAirplane
