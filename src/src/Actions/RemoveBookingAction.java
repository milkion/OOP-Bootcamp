package src.Actions;

import src.ActionCapables.Booking;
import src.BookingSystem;
import src.ActionCapables.User;

/**
 * Action to remove a booking from the booking system.
 * @see Action
 */
public class RemoveBookingAction implements Action {

    /**
     * The booking to be removed.
     */
    private Booking oldBooking;


    /**
     * Constructor.
     * @param oldBooking The booking to be removed.
     */
    public RemoveBookingAction(Booking oldBooking){
        this.oldBooking = oldBooking;
    }

    /**
     * Executes the action.
     * @param user The user that executes the action.
     * @param bookingSystem The booking system that the action is executed on.
     * @return A string that represents the result of the action.
     */
    @Override
    public String execute(User user, BookingSystem bookingSystem){
        user.removeBookings(oldBooking);
        return oldBooking.toString() + " has been removed from the Booking System";
    }

    /**
     * @return A description of the action.
     */
    @Override
    public String menuDescription(){
        return "Remove the following vehicle to the Booking System:\n" + oldBooking;
    }


}
