package src.Vehicles;

import src.ActionCapables.Vehicle;
import src.Utility;

/**
 * A Class for Sedan vehicles.
 */
public class Sedan extends Vehicle {

    private int range;
    private EngineType engineType;

    /**
     * Constructor for Sedan.
     * @param brand Brand of the Sedan.
     * @param year Year of the Sedan.
     * @param price Price of the Sedan.
     * @param range Range of the Sedan.
     * @param engineType Engine Type of the Sedan.
     */
    public Sedan(String brand, int year, double price, int range, EngineType engineType){
        super(brand, year, price, "Sedan" + Utility.generateRandomInt(10000, 99999));
        this.range = range;
        this.engineType = engineType;
    }


    /**
     * Getter for the range of the Sedan.
     * @return Range of the Sedan.
     */
    @Override
    public String toString(){
        return String.format("%s | Range: %d km | Engine Type: %s", super.toString(), range, engineType);
    }
}

