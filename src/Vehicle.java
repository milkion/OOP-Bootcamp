public class Vehicle {

    private String brand;
    private int year;
    private double price;

    public Vehicle(String brand, int year, double price){
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString(){
        return String.format("Brand: %s \nYear: %d \nPrice: %.2f per day", brand, year, price);
    }

}
