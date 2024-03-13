public class AddBookingAction extends Action{

    private Booking newBooking;

    public AddBookingAction(Booking newBooking){
        this.newBooking = newBooking;
    }

    public String execute(BookingSystem bookingSystem){
        bookingSystem.addBookings(newBooking);
        return newBooking + " is successfully added to the Booking System!";
    }

    public String menuDescription(){
        return "Add the following vehicle to the Booking System:\n" + newBooking;
    }

}
