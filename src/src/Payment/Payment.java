package src.Payment;


/**
 * This interface is used to define the methods that must be implemented by a payment method
 */
public interface Payment {

    /**
     * This method processes the payment
     * @param amount The amount to be paid
     * @return A string indicating the status of the payment
     */
    public String processPayment(float amount);


    /**
     * This method returns a description of the payment method
     * @return A string describing the payment method
     */
    public String paymentDescription();


    /**
     * This method checks if the payment was successful
     * @param amount The amount to be paid
     * @return A boolean indicating if the payment was successful
     */
    public boolean paymentSuccess(float amount);

}
