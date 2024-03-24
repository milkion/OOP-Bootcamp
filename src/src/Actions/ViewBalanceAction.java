package src.Actions;

import src.BookingSystem;
import src.ActionCapables.User;

public class ViewBalanceAction implements Action {

    @Override
    public String execute(User user, BookingSystem bookingSystem){
        return "You have a balance of " + user.getBalance();
    }

    @Override
    public String menuDescription(){
        return "View balance.";
    }
}
