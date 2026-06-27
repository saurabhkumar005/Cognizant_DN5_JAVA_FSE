package Week1.Design_Principle_and_Pattern.Ex1_Singleton;

public class Logger {
    private static Logger instance;
    private Logger(){
        System.out.println("Logger Instance Created.");
    }
    public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message){
        System.out.println("LOG: "+message);
    }
}
