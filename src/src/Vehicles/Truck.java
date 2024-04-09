package src.Vehicles;

import src.ActionCapables.Vehicle;
import src.Utility;


/**
 * A Class for Truck vehicles.
 */
public class Truck extends Vehicle {

    private double loading;

    /**
     * Constructor for Truck.
     * @param brand Brand of the Truck.
     * @param year Year of the Truck.
     * @param price Price of the Truck.
     * @param loading Loading capacity of the Truck.
     */
    public Truck(String brand, int year, double price, double loading){
        super(brand, year, price, "Truck" + Utility.generateRandomInt(100, 999));
        this.loading = loading;
    }

    /**
     * Getter for the loading capacity of the Truck.
     * @return Loading capacity of the Truck.
     */
    @Override
    public String toString(){
        return String.format("%s | Loading: %.1f", super.toString(), loading);
    }
}
