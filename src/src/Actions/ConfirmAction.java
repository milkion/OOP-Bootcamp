package src.Actions;

import src.BookingSystem;
import src.ActionCapables.User;
import src.ActionCapables.Booking;

/**
 * This is a ConfirmAction class that represents an action to confirm bookings in the booking system.
 * It implements the Action interface.
 */
public class ConfirmAction implements Action {


    /**
     * Executes the action for a given user in the booking system.
     *
     * @param user the user who is executing the action
     * @param bookingSystem the booking system in which the action is being executed
     * @return a string representing the result of the action execution
     */
    @Override
    public String execute(User user, BookingSystem bookingSystem){

        double total = 0;
//        ArrayList<booking.Booking> bookingList = user.getBookingList();

        for (Booking booking : user.getBookingList()){
            double price = booking.getVehicle().getPrice();
            total += price;
        }

        double deduction = user.getBalance() - total;
        user.setBalance(deduction);

        user.getBookingList().clear();

        return "Bookings confirmed. A total price of $" + total + " has been deducted from your " +
                "balance.\nYou have $" + user.getBalance() + " remaining.\nThank you for using FIT2099 Booking System";

    };


    /**
     * @return a string representing the description of the action
     */
    @Override
    public String menuDescription(){
        return "Confirm bookings.";
    };
}
