package src.Actions;

import src.BookingSystem;
import src.ActionCapables.User;

public class DisplayBookingAction implements Action {

    @Override
    public String execute(User user, BookingSystem bookingSystem){

        return user.displayBookedVehicles();
    }

    @Override
    public String menuDescription(){

        return "View bookings.";
    };
}
