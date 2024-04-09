package src.ActionCapables;

import src.Actions.Action;
import src.ActionCapable;
import src.Actions.AddBookingAction;

import java.util.ArrayList;
import java.util.List;



/**
 * Class for the Vehicle.
 */
public class Vehicle implements ActionCapable {

    private String brand;
    private int year;
    private double price;

    private String vehicleID;


    /**
     * Constructor for the Vehicle class.
     *
     * @param brand the brand of the vehicle
     * @param year the year the vehicle was made
     * @param price the price of the vehicle
     * @param vehicleID the vehicle ID
     */
    public Vehicle(String brand, int year, double price, String vehicleID){
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.vehicleID = vehicleID;
    }

    /**
     * Gets the brand of the vehicle.
     *
     * @return the brand of the vehicle
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the year the vehicle was made.
     *
     * @return the year the vehicle was made
     */
    @Override
    public String toString(){
        return String.format("Vehicle detail: Vehicle ID: %s Brand: %s | Year: %d | Price: %.2f per day", vehicleID, brand, year, price);
    }


    /**
     * Gets the vehicle ID.
     *
     * @return the vehicle ID
     */
    @Override
    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        Booking booking = new Booking(this);
        actions.add(new AddBookingAction(booking));
        return actions;
    }

}
