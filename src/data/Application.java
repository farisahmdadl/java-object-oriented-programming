package data;

public class Application {

    public static final int Processors;

    static {
        System.out.println("Class Application");
        Processors =  Runtime.getRuntime().availableProcessors();
    }
}
