package src.Actions;

import src.BookingSystem;
import src.ActionCapables.User;

public interface Action {

    public abstract String execute(User user, BookingSystem bookingSystem);
    public abstract String menuDescription();
}
