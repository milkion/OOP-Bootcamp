public class Truck extends Vehicle{

    private double loading;
    public Truck(String brand, int year, double price, double loading){
        super(brand, year, price);
        this.loading = loading;
    }

    @Override
    public String toString(){
        return String.format("%s \nLoading: %.1f \n", super.toString(), loading);
    }
}
