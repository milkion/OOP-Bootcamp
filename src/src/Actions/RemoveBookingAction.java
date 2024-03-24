package src.Actions;

import src.ActionCapables.Booking;
import src.BookingSystem;
import src.ActionCapables.User;

public class RemoveBookingAction implements Action {

    private Booking oldBooking;

    public RemoveBookingAction(Booking oldBooking){
        this.oldBooking = oldBooking;
    }
    @Override
    public String execute(User user, BookingSystem bookingSystem){
        user.removeBookings(oldBooking);
        return oldBooking.toString() + " has been removed from the Booking System";
    }

    @Override
    public String menuDescription(){
        return "Remove the following vehicle to the Booking System:\n" + oldBooking;
    }


}
