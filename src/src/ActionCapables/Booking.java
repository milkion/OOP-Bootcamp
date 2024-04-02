package src.ActionCapables;


/**
 * This is a Booking class that represents a booking with a vehicle.
 */
public class Booking {

    private Vehicle vehicle;


    /**
     * Constructs a new Booking with the given vehicle.
     *
     * @param vehicle the vehicle of the booking
     */
    public Booking(Vehicle vehicle){

        this.vehicle = vehicle;
    }

    /**
     * Returns the vehicle of the booking.
     *
     * @return the vehicle of the booking
     */
    public Vehicle getVehicle() {

        return vehicle;
    }

    /**
     * Returns a string representation of the booking.
     *
     * @return a string representation of the booking
     */
    public String toString(){

        return this.vehicle.toString();
    }


}
