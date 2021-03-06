package dkit.oop;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * AirplaneManager is a container class that stores Airplanes
 * (of various class types) in a list.
 * It provides a public interface of methods that can
 * be used to manage the planes in the list.
 * It "encapsulates" the logic for managing Airplanes
 * and "hides" the data structures used to store the data.
 */

public class AirplaneManager {

    ArrayList<Airplane> airplaneList;

    public AirplaneManager() {
        airplaneList = new ArrayList<>();
    }

    //Q3.

    // write add() method
    public void add(Airplane airplane) {
        airplaneList.add(airplane);
    }

    public void displayAllAirplanes() {
        // add code
        for (Airplane a : airplaneList) {
            System.out.println(a);
        }
    }

    public void displayAllPassengerAirplanes() {
        // add code
        for (Airplane a : airplaneList) {
            if (a instanceof PassengerAirplane) {
                System.out.println(a);
            }
        }
    }

    //  write method getAllCargoAirplanes()
    public List<CargoAirplane> getAllCargoAirplanes() {
        ArrayList<CargoAirplane> cargoPlanes = new ArrayList<>();
        for (Airplane a : airplaneList) {
            if (a instanceof CargoAirplane) {
                cargoPlanes.add((CargoAirplane) a);
            }
        }
        return cargoPlanes;
    }

    // write  addPassengerNameToAirplane( airplaneId, passengerName)

    public boolean addPassengerNameToAirplane(int airplaneId, String passengerName) {
        for (Airplane a : airplaneList) {
            if (a instanceof PassengerAirplane && a.getId() == airplaneId) {
                ((PassengerAirplane) a).addPassenger(passengerName);
                return true;
            }


        }
        return false;
    }

    // write containsAirplane( Airplane plane )
    public boolean containsAirplane(Airplane plane) {
        for (Airplane a : airplaneList) {
            if (a.getId() == plane.getId()) {
                return true;
            }
        }

        return false;

    }



    // write findAirplaneByPassengerName( passengerName )
    public Airplane findAirplaneByPassengerName( String passengerName )
    {
        for (Airplane a : airplaneList) {
            if (a instanceof PassengerAirplane && ((PassengerAirplane) a).passengerList.contains(passengerName)) {

                return a;
            }
        }


        return null;
    }


    // write displayAllAirplanesInOrderOfType( argument )

    public static class PlaneTypeComparator implements Comparator<Airplane> {

        public int compare(Airplane a1, Airplane a2) {
            return a1.getType().compareTo(a2.getType());
        }
    }

    PlaneTypeComparator planeTypeComparator = new PlaneTypeComparator();
    public void displayAllAirplanesInOrderOfType()
    {
        Collections.sort(airplaneList, planeTypeComparator);
        for (Airplane a : airplaneList) {
            System.out.println(a);
        }


    }

} // end of AirplaneManager


