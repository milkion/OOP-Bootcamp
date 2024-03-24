package src.ActionCapables;

import src.ActionCapable;
import src.Actions.*;

import java.util.ArrayList;
import java.util.List;


public class User implements ActionCapable {

    private double balance;
    private boolean isUserDone;

    private ArrayList<Booking> bookingList = new ArrayList<>();



    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isUserDone() {
        return isUserDone;
    }

    public void setUserDone(boolean userDone) {
        isUserDone = userDone;
    }

    public ArrayList<Booking> getBookingList() {
        return bookingList;
    }


    public void addBookings(Booking booking) {

        bookingList.add(booking);
    }

    public void removeBookings(Booking booking){
        bookingList.remove(booking);
    }


    public String displayBookedVehicles(){
        String displayMsg = "";
        for(Booking booking : bookingList){
            displayMsg += booking.toString() + "\n";
        }

        return displayMsg;
    }

    @Override
    public List<Action> allowableActions(){
        List<Action> actions = new ArrayList<>();
        actions.add(new AddBalanceAction());
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
