package src.Actions;

import src.BookingSystem;
import src.ActionCapables.User;
import src.ActionCapables.Booking;

public class AddBookingAction implements Action {

    private Booking newBooking;

    public AddBookingAction(Booking newBooking){
        this.newBooking = newBooking;
    }

    @Override
    public String execute(User user, BookingSystem bookingSystem){
        user.addBookings(newBooking);

        return newBooking + " is successfully added to the Booking System!";
    }

    @Override
    public String menuDescription(){
        return "Add the following vehicle to the Booking System: " + newBooking;
    }

}
