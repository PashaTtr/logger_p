public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("logdata 1");

        Logger logger2 = Logger.getInstance();
        logger2.log("logdata 2");

        if (logger1 == logger2) {
            System.out.println("logdata 1 і logdata 2  = a copied");
        } else {
            System.out.println("logger1 і logger2 = two another copy");
        }

        performLogging();
    }

    public static void performLogging() {
        Logger logger = Logger.getInstance();
        logger.log("logdata 3 (another)");
    }
}
