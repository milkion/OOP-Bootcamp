package src.Vehicles;

import src.ActionCapables.Vehicle;

public class SUV extends Vehicle {

    private int seats;
    private EngineType engineType;

    public SUV(String brand, int year, double price, int seats, EngineType engineType){
        super(brand, year, price);
        this.seats = seats;
        this.engineType = engineType;
    }

    @Override
    public String toString(){
        return String.format("%s | Engine Type: %s | Number of Seats: %d", super.toString(), engineType, seats);
    }
}
