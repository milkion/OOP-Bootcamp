package src.Actions;

import src.BookingSystem;
import src.ActionCapables.User;
import src.ActionCapables.Booking;

public class ConfirmAction implements Action {

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

    @Override
    public String menuDescription(){
        return "Confirm bookings.";
    };
}
