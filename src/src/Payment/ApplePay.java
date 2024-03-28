package src.Payment;

public class ApplePay implements Payment{

    private static final int PAYMENT_LIMIT = 1000;

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

    @Override
    public String paymentDescription(){
        return "Apple pay";
    };

    @Override
    public boolean paymentSuccess(float amount){
        return amount <= PAYMENT_LIMIT;
    };

}

