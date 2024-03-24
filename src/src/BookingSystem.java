package src;

import src.Vehicles.*;
import src.ActionCapables.User;
import src.ActionCapables.Vehicle;
import src.Actions.Action;

import java.util.ArrayList;
import java.util.List;

public class BookingSystem {

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    User user = new User();



    public void consoleMenu() {
        while (!user.isUserDone()){

            List<Action> actions = new ArrayList<>();
            List<ActionCapable> actionCapables = new ArrayList<>();

            actionCapables.add(user);
            actionCapables.addAll(vehicles);

            for (ActionCapable actionCapable : actionCapables) {
                actions.addAll(actionCapable.allowableActions());
            }

            System.out.println("#########################################");
            Action action = Menu.showMenu(actions);
            System.out.println(action.execute(user,this));

        }
    }

    public void printStatus() {
        System.out.println("Welcome to FIT2099 booking.Booking System");
        createVehicles();
        consoleMenu();
    }

    public void createVehicles(){
        vehicles.add(new Sedan("Lexus", 2023, 200.00, 500, EngineType.ELECTRIC));
        vehicles.add(new Sedan("BMW",  2022, 150.00, 600, EngineType.PETROL));
        vehicles.add(new SUV("Tesla", 2023, 300.00, 5, EngineType.ELECTRIC));
        vehicles.add(new SUV("Mercedes", 2020, 500.00, 7, EngineType.DIESEL));
        vehicles.add(new Truck("Ford", 2019, 400.00, 1.0));
        vehicles.add(new Truck("Volkswagen", 2020, 450.00, 1.2));

    }


}
