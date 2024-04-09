package src.Payment;


/**
 * This class implements the Payment interface and
 * is used to process payments using Apple Pay
 */

public class ApplePay implements Payment{

    /**
     * The maximum amount that can be paid using Apple Pay
     */
    private static final int PAYMENT_LIMIT = 1000;


    /**
     * This method processes the payment using Apple Pay
     * @param amount The amount to be paid
     * @return A string indicating the status of the payment
     */
    @Override
    public String processPayment(float amount) {

        String output = "";

        if (amount > PAYMENT_LIMIT) {
            output = "Limit exceeded for payment of $" + (amount - PAYMENT_LIMIT);
        } else{
            output = "Payment processed by Apply Pay: $" + amount;
        }

        return output;
    }

    /**
     * This method returns a description of the payment method
     * @return A string describing the payment method
     */
    @Override
    public String paymentDescription(){
        return "Apple pay";
    };

    /**
     * This method checks if the payment was successful
     * @param amount The amount to be paid
     * @return A boolean indicating if the payment was successful
     */
    @Override
    public boolean paymentSuccess(float amount){
        return amount <= PAYMENT_LIMIT;
    };

}

