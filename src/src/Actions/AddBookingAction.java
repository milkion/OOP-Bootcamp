package src.Actions;

import src.BookingSystem;
import src.ActionCapables.User;
import src.ActionCapables.Booking;

/**
 * This is an AddBookingAction class that represents an action to add a booking to the booking system.
 * It implements the Action interface.
 */
public class AddBookingAction implements Action {

    private Booking newBooking;

    /**
     * Constructs an AddBookingAction with a given booking.
     *
     * @param newBooking the booking to be added to the booking system
     */
    public AddBookingAction(Booking newBooking){
        this.newBooking = newBooking;
    }

    /**
     * Executes the action for a given user in the booking system.
     *
     * @param user the user who is executing the action
     * @param bookingSystem the booking system in which the action is being executed
     * @return a string representing the result of the action execution
     */
    @Override
    public String execute(User user, BookingSystem bookingSystem){
        user.addBookings(newBooking);

        return newBooking + " is successfully added to the Booking System!";
    }

    /**
     * @return a string representing the description of the action
     */
    @Override
    public String menuDescription(){
        return "Add the following vehicle to the Booking System: " + newBooking;
    }

}
