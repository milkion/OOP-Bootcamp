package src.Actions;


import src.BookingSystem;
import src.ActionCapables.User;

/**
 * Action to exit the system.
 * @see Action
 */
public class ExitAction implements Action {

    /**
     * Executes the action.
     * @param user The user that executes the action.
     * @param bookingSystem The booking system that the action is executed on.
     * @return A string that represents the result of the action.
     */
    @Override
    public String execute(User user, BookingSystem bookingSystem){
        user.setUserDone(true);

        return "Thank you for visiting FIT2099 Vehicle Booking System!";

    }

    /**
     * @return A description of the action.
     */
    @Override
    public String menuDescription(){
        return "Exit the System.";
    };
}
