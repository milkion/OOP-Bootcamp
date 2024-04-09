package src.Actions;

import src.BookingSystem;
import src.ActionCapables.User;
import src.Payment.Payment;

import java.util.Scanner;


/**
 * This is an AddBalanceAction class that represents an action to add balance to a user's account.
 * It implements the Action interface.
 */
public class AddBalanceAction implements Action {

    private Payment payment;

    private boolean payment_true;


    /**
     * Constructs an AddBalanceAction with a given payment method.
     *
     * @param payment the payment method to be used for adding balance
     */
    public AddBalanceAction(Payment payment){
        this.payment = payment;
    }


    /**
     * Executes the action for a given user in the booking system.
     *
     * @param user the user who is executing the action
     * @param bookingSystem the booking system in which the action is being executed
     * @return a string representing the result of the action execution
     */
    @Override
    public String execute(User user, BookingSystem bookingSystem){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to add to your current balance: ");

        float balance = Float.parseFloat(scanner.nextLine());

        System.out.println(payment.processPayment(balance));

        if (payment.paymentSuccess(balance)) {
            user.setBalance(balance);
        } else {
            return "Failed to add to the user balance.";
        }

        return String.format("%.2f is added to the user balance!", balance);
    }

    /**
     * @return a string representing the description of the action
     */
    @Override
    public String menuDescription(){
        return "Add balance with " + payment.paymentDescription();
    }

}
