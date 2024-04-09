package src.ActionCapables;

import src.ActionCapable;
import src.Actions.*;
import src.Payment.ApplePay;
import src.Payment.GooglePay;
import src.Payment.Payment;

import java.util.ArrayList;
import java.util.List;



/**
 * This is a User class that represents a user with a balance, a list of bookings, and a status indicating if the user is done.
 * It implements the ActionCapable interface.
 */
public class User implements ActionCapable {

    private double balance = 0;
    private boolean isUserDone;

    private ArrayList<Booking> bookingList = new ArrayList<>();


    /**
     * Returns the balance of the user.
     *
     * @return the balance of the user
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the balance of the user.
     *
     * @param balance the balance of the user
     */
    public void setBalance(double balance) {
        this.balance += balance;
    }

    /**
     * Returns the status of the user.
     *
     * @return the status of the user
     */
    public boolean isUserDone() {
        return isUserDone;
    }

    /**
     * Sets the status of the user.
     *
     * @param userDone the status of the user
     */
    public void setUserDone(boolean userDone) {
        isUserDone = userDone;
    }

    /**
     * Returns the list of bookings of the user.
     *
     * @return the list of bookings of the user
     */
    public ArrayList<Booking> getBookingList() {
        return bookingList;
    }


    /**
     * Adds a booking to the list of bookings of the user.
     *
     * @param booking the booking to be added
     */
    public void addBookings(Booking booking) {

        bookingList.add(booking);
    }


    /**
     * Removes a booking from the list of bookings of the user.
     *
     * @param booking the booking to be removed
     */
    public void removeBookings(Booking booking){
        bookingList.remove(booking);
    }


    /**
     * Displays the list of bookings of the user.
     *
     * @return the list of bookings of the user
     */
    public String displayBookedVehicles(){
        String displayMsg = "";
        for(Booking booking : bookingList){
            displayMsg += booking.toString() + "\n";
        }

        return displayMsg;
    }

    /**
     * Returns the list of allowable actions of the user.
     *
     * @return the list of allowable actions of the user
     */
    @Override
    public List<Action> allowableActions(){
        List<Action> actions = new ArrayList<>();

        actions.add(new AddBalanceAction(new ApplePay()));
        actions.add(new AddBalanceAction(new GooglePay()));
        actions.add(new ViewBalanceAction());
        actions.add(new DisplayBookingAction());
        actions.add(new ConfirmAction());
        actions.add(new ExitAction());

        for (Booking booking : bookingList){
            actions.add(new RemoveBookingAction(booking));
        }

        return actions;


    }


}
