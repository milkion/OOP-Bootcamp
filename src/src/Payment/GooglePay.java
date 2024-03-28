package src.Payment;

public class GooglePay implements Payment{

    @Override
    public String processPayment(float amount){

        String output = "";
        output = "Payment processed by Google Play: $" + amount;
        return output;
    }

    @Override
    public String paymentDescription(){
        return "Google Pay";
    };


    @Override
    public boolean paymentSuccess(float amount){
        return true;
    };

}
