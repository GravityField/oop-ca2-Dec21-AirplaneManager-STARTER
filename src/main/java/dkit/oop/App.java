package dkit.oop;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * OOP CA2 December 2021 - Airplane Management System  STARTER CODE
 */
public class App 
{
    public static void main( String[] args ){
        new App().start();
    }

    private void start() {

        System.out.println("OOP - CA2 - 20% - December 2021 - AirplaneManager");

        //Q2
         CargoAirplane cargoPlane1 = new CargoAirplane("Douglas DC-4",20000);
         CargoAirplane cargoPlane2 = new CargoAirplane("Boeing C-7000",25000);

        // display the two objects

        System.out.println(cargoPlane1);
        System.out.println(cargoPlane2);


        AirplaneManager mgr = new AirplaneManager();

        //Q2
        System.out.println("Question 2");
         PassengerAirplane passengerPlane1 = new PassengerAirplane("Boeing 747",524);
         PassengerAirplane passengerPlane2 = new PassengerAirplane("Airbus 380",525);
        System.out.println(passengerPlane1);
        System.out.println(passengerPlane2);

//         //Add passengers to Passenger planes
         passengerPlane1.addPassenger("Tom Hardy");
         passengerPlane1.addPassenger("Margot Robbie");
         passengerPlane2.addPassenger("Emma Thompson");

        System.out.println(passengerPlane1);
        System.out.println(passengerPlane2);


        //Q3

        // write calls to methods implemented for Q3.
        System.out.println("Question 3");
        mgr.add(cargoPlane1);
        mgr.add(cargoPlane2);
        mgr.add(passengerPlane1);
        mgr.add(passengerPlane2);

        System.out.println("Display All Airplanes");
        mgr.displayAllAirplanes();
        System.out.println("Display Passenger Planes");
        mgr.displayAllPassengerAirplanes();
        System.out.println("Return List of Cargo Planes");
        List<CargoAirplane> returnedPlanes = mgr.getAllCargoAirplanes();
        System.out.println(returnedPlanes);

        int planeId = passengerPlane1.getId();
        boolean added = mgr.addPassengerNameToAirplane(planeId, "James May");
        if(added)
        {
            System.out.println("Passenger Has Been Added");
        }
        else
        {
            System.out.println("Passenger Not Added");
        }
        System.out.println(passengerPlane1);


        boolean isThere = mgr.containsAirplane(passengerPlane1);
        System.out.println(isThere);





        //Question 4
        // Uncomment all the code below and implement the two methods
        // in the CityDistanceManager class.

//        CityDistanceManager cityDistanceManager = new CityDistanceManager();
//        cityDistanceManager.printCitiesData();
//
//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("\nPlease enter first city name:");
//        String city1 = keyboard.nextLine();
//        System.out.print("Please enter second city name:");
//        String city2 = keyboard.nextLine();
//
//        int distance = cityDistanceManager.findDistanceBetween(city1, city2);
//        System.out.println("Distance between " + city1 + " and " + city2 + " = " + distance);
//
//        System.out.print("\nEnter base city name:");
//        String baseCity = keyboard.nextLine();
//
//        String closestCity = cityDistanceManager.findClosestCityTo(baseCity);
//        System.out.println("Closest city to " + baseCity+" = " + closestCity);

    }
}
