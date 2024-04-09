package src.Actions;

import src.BookingSystem;
import src.ActionCapables.User;

/**
 * This is an Action interface that represents an action that can be executed by a user in the booking system.
 * It provides two methods: execute and menuDescription.
 */
public interface Action {

    /**
     * Executes the action for a given user in the booking system.
     *
     * @param user the user who is executing the action
     * @param bookingSystem the booking system in which the action is being executed
     * @return a string representing the result of the action execution
     */
    public abstract String execute(User user, BookingSystem bookingSystem);

    /**
     * Returns a string representing the description of the action.
     *
     * @return a string representing the description of the action
     */
    public abstract String menuDescription();
}
