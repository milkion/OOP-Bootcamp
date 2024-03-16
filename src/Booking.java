public class Booking {

    private final Vehicle vehicle;

    public Booking(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public String toString(){
        return this.vehicle.toString();
    }

}
