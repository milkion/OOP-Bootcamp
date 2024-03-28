package src;

public class Utility {

    public static int generateRandomInt(int lower, int upper){
        return (int)((Math.random() * (upper-lower) + lower));
    }
}
