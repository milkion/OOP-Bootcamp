package src.Actions;


import src.BookingSystem;
import src.ActionCapables.User;

public class ExitAction implements Action {

    @Override
    public String execute(User user, BookingSystem bookingSystem){
        user.setUserDone(true);

        return "Thank you for visiting FIT2099 Vehicle Booking System!";

    }

    @Override
    public String menuDescription(){
        return "Exit the System.";
    };
}
