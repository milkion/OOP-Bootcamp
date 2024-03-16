import java.sql.Array;
import java.util.ArrayList;

public class BookingSystem {

    Vehicle[] vehicles = new Vehicle[6];

    ArrayList<Booking> bookingList = new ArrayList<>();

    public void addBookings(Booking booking) {
        bookingList.add(booking);
    }

    public void addBookingForVehicle() {

        ArrayList<Action> actions = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            actions.add(new AddBookingAction(new Booking(vehicle)));
        }

        System.out.println("#########################################");
        Action action = Menu.showMenu(actions);
        System.out.println(action.execute(this));

    }

    public void printStatus() {
        System.out.println("Welcome to FIT2099 Booking System");
        createVehicles();
        addBookingForVehicle();
//        displayVehicles();
        System.out.println("Thank you for visiting FIT2099 Booking System!");
    }

    public void createVehicles(){
        vehicles[0] = new Sedan("Lexus", 2023, 200.00, 500, EngineType.ELECTRIC);
        vehicles[1] = new Sedan("BMW",  2022, 150.00, 600, EngineType.PETROL);
        vehicles[2] = new SUV("Tesla", 2023, 300.00, 5, EngineType.ELECTRIC);
        vehicles[3] = new SUV("Mercedes", 2020, 500.00, 7, EngineType.DIESEL);
        vehicles[4] = new Truck("Ford", 2019, 400.00, 1.0);
        vehicles[5] = new Truck("Volkswagen", 2020, 450.00, 1.2);

    }

    public void displayVehicles(){
        int bookingNum = 1;
        for(int i = 0; i < vehicles.length; i++){

            System.out.println("Booking Item (" + bookingNum + ")");
            System.out.println(vehicles[i].toString());
            bookingNum++;
        }
    }

}
