package Week1.Design_Principle_and_Pattern.SingletonPatternExample;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Server started");
        Logger logger2 = Logger.getInstance();
        logger2.log("User Signed in");
        System.out.println("Logger1 hashcode: "+logger1.hashCode());
        System.out.println("Logger2 hashcode: "+logger2.hashCode());
        System.out.println("Is logger1 and logger2 refrences to same memory: "+(logger1==logger2));

    }
}
