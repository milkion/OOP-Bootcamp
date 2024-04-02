package src.Actions;

import src.BookingSystem;
import src.ActionCapables.User;

/**
 * Action to display the bookings of a user.
 * @see Action
 */
public class DisplayBookingAction implements Action {

    /**
     * Executes the action.
     * @param user The user that executes the action.
     * @param bookingSystem The booking system that the action is executed on.
     * @return A string that represents the result of the action.
     */
    @Override
    public String execute(User user, BookingSystem bookingSystem){

        return user.displayBookedVehicles();
    }

    /**
     * @return A description of the action.
     */
    @Override
    public String menuDescription(){

        return "View bookings.";
    };
}
