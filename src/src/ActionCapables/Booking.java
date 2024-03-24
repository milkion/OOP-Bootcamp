package src.ActionCapables;

public class Booking {

    private Vehicle vehicle;

    public Booking(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String toString(){
        return this.vehicle.toString();
    }


}
