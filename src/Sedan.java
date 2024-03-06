public class Sedan extends Vehicle{

    private int range;
    private EngineType engineType;
    public Sedan(String brand, int year, double price, int range, EngineType engineType){
        super(brand, year, price);
        this.range = range;
        this.engineType = engineType;
    }

    @Override
    public String toString(){
        return String.format("%s \nRange: %d km \nEngine Type: %s\n", super.toString(), range, engineType);
    }
}

