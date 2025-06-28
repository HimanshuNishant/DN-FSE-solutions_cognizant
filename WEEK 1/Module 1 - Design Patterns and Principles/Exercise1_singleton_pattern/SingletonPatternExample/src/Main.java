public class Main {
    public static void main(String[] args) {
        // Step 4: Test Singleton Implementation
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is the first message.");
        logger2.log("This is the second message.");

        // Check if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Different Logger instances exist.");
        }
    }
}
