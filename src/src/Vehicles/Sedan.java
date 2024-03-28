package src.Vehicles;

import src.ActionCapables.Vehicle;
import src.Utility;

public class Sedan extends Vehicle {

    private int range;
    private EngineType engineType;
    public Sedan(String brand, int year, double price, int range, EngineType engineType){
        super(brand, year, price, "Sedan" + Utility.generateRandomInt(10000, 99999));
        this.range = range;
        this.engineType = engineType;
    }

    @Override
    public String toString(){
        return String.format("%s | Range: %d km | Engine Type: %s", super.toString(), range, engineType);
    }
}

