package src.ActionCapables;

import src.Actions.Action;
import src.ActionCapable;
import src.Actions.AddBookingAction;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements ActionCapable {

    private String brand;
    private int year;
    private double price;

    private String vehicleID;


    public Vehicle(String brand, int year, double price, String vehicleID){
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.vehicleID = vehicleID;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return String.format("Vehicle detail: Vehicle ID: %s Brand: %s | Year: %d | Price: %.2f per day", vehicleID, brand, year, price);
    }

    @Override
    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        Booking booking = new Booking(this);
        actions.add(new AddBookingAction(booking));
        return actions;
    }

}
