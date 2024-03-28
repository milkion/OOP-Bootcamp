package src.Actions;

import src.BookingSystem;
import src.ActionCapables.User;
import src.Payment.Payment;

import java.util.Scanner;

public class AddBalanceAction implements Action {

    private Payment payment;

    private boolean payment_true;

    public AddBalanceAction(Payment payment){
        this.payment = payment;
    }

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

    @Override
    public String menuDescription(){
        return "Add balance with " + payment.paymentDescription();
    }

}
