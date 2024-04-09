package src;

/**
 * Utility class for the application.
 */
public class Utility {

    /**
     * Generates a random integer between the lower and upper bounds.
     * @param lower Lower bound of the random integer.
     * @param upper Upper bound of the random integer.
     * @return Random integer between the lower and upper bounds.
     */
    public static int generateRandomInt(int lower, int upper){
        return (int)((Math.random() * (upper-lower) + lower));
    }
}
