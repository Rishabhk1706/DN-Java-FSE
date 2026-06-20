package SingletonPatternExample;

public class Logger{

    // Create a private static instance
    private static Logger instance;

    // Private constructor
    private Logger(){
        System.out.println("Logger instance created.");
    }

    // Public method to provide access
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    // Logging method
    public void log(String message){
        System.out.println("LOG: " + message);
    }
}