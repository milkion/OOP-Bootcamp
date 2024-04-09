package src.Vehicles;

import src.ActionCapables.Vehicle;
import src.Utility;


/**
 * A Class for SUV vehicles.
 */
public class SUV extends Vehicle {

    private int seats;
    private EngineType engineType;

    /**
     * Constructor for SUV.
     * @param brand Brand of the SUV.
     * @param year Year of the SUV.
     * @param price Price of the SUV.
     * @param seats Number of seats in the SUV.
     * @param engineType Engine Type of the SUV.
     */
    public SUV(String brand, int year, double price, int seats, EngineType engineType){
        super(brand, year, price, "SUV" + Utility.generateRandomInt(1000, 9999));
        this.seats = seats;
        this.engineType = engineType;
    }

    /**
     * Getter for the number of seats in the SUV.
     * @return Number of seats in the SUV.
     */
    @Override
    public String toString(){
        return String.format("%s | Engine Type: %s | Number of Seats: %d", super.toString(), engineType, seats);
    }
}
