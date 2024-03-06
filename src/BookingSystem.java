public class BookingSystem {

    Vehicle[] vehicles = new Vehicle[6];

    public void printStatus() {
        System.out.println("Welcome to FIT2099 Booking System \n");
        createVehicles();
        displayVehicles();
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
            System.out.println(vehicles[0].toString());
            bookingNum++;
        }
    }

}
