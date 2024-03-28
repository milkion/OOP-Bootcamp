package src.Payment;

public interface Payment {

    public String processPayment(float amount);

    public String paymentDescription();

    public boolean paymentSuccess(float amount);

}
