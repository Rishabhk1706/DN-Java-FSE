package SingletonPatternExample;

public class Test{
    public static void main(String[] args) {

        // Get instance 1
        Logger logger1 = Logger.getInstance();
        logger1.log("First message");

        // Get instance 2
        Logger logger2 = Logger.getInstance();
        logger2.log("Second message");

        // Verify both references are same
        if(logger1 == logger2){
            System.out.println("Both logger instances are same.");
        }
        else{
            System.out.println("Different instances exist!");
        }
    }
}