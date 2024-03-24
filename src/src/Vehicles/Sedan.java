package src.Vehicles;

import src.ActionCapables.Vehicle;

public class Sedan extends Vehicle {

    private int range;
    private EngineType engineType;
    public Sedan(String brand, int year, double price, int range, EngineType engineType){
        super(brand, year, price);
        this.range = range;
        this.engineType = engineType;
    }

    @Override
    public String toString(){
        return String.format("%s | Range: %d km | Engine Type: %s", super.toString(), range, engineType);
    }
}

