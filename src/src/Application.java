package src;


/**
 * Main class for the application.
 */
public class Application {

    /**
     * Main method for the application.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        BookingSystem newSystem = new BookingSystem();
        newSystem.printStatus();
    }

}
