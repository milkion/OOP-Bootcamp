package src.Payment;

/**
 * This class implements the Payment interface and
 * is used to process payments using Google Pay
 */
public class GooglePay implements Payment{

    /**
     * This method processes the payment using Google Pay
     * @param amount The amount to be paid
     * @return A string indicating the status of the payment
     */
    @Override
    public String processPayment(float amount){

        String output = "";
        output = "Payment processed by Google Play: $" + amount;
        return output;
    }

    /**
     * This method returns a description of the payment method
     * @return A string describing the payment method
     */
    @Override
    public String paymentDescription(){
        return "Google Pay";
    };


    /**
     * This method checks if the payment was successful
     * @param amount The amount to be paid
     * @return A boolean indicating if the payment was successful
     */
    @Override
    public boolean paymentSuccess(float amount){
        return true;
    };

}
