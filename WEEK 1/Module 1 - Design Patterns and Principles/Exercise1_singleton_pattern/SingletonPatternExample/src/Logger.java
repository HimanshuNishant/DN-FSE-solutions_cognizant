public class Logger {
    // Step 2: Private static instance
    private static Logger instance;

    // Step 2: Private constructor
    private Logger() {
        System.out.println("Logger Initialized.");
    }

    // Step 2: Public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // create instance only once
        }
        return instance;
    }

    // Sample log method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
